package elnushop.item.impl;

import static java.util.concurrent.CompletableFuture.completedFuture;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import elnushop.item.api.CreateItemRequest;
import elnushop.item.api.CreateItemResponse;
import elnushop.item.api.Item;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.pcollections.PSequence;
import org.pcollections.TreePVector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lightbend.lagom.javadsl.api.ServiceCall;
import com.lightbend.lagom.javadsl.api.transport.NotFound;
import com.lightbend.lagom.javadsl.persistence.PersistentEntityRegistry;
import com.lightbend.lagom.javadsl.persistence.cassandra.CassandraReadSide;
import com.lightbend.lagom.javadsl.persistence.cassandra.CassandraSession;

import akka.NotUsed;
import akka.stream.IOResult;
import akka.stream.javadsl.FileIO;
import akka.stream.javadsl.Source;
import akka.util.ByteString;

import elnushop.item.api.ItemService;

public class ItemServiceImpl implements ItemService {

	private static final Logger LOGGER = LoggerFactory.getLogger(ItemServiceImpl.class);

	private final PersistentEntityRegistry persistentEntities;
	private final CassandraSession db;

	@Inject
	public ItemServiceImpl(PersistentEntityRegistry persistentEntities, CassandraReadSide readSide,
			CassandraSession db) {
		this.persistentEntities = persistentEntities;
		this.db = db;

		persistentEntities.register(ItemEntity.class);
		readSide.register(ItemEventProcessor.class);
	}

	@Override
	public ServiceCall<NotUsed, Item> getItem(String id) {

		return (req) -> {
			return persistentEntities.refFor(ItemEntity.class, id).ask(GetItem.of()).thenApply(reply -> {
				LOGGER.info(String.format("Looking up item %s", id));
				if (reply.getItem().isPresent())
					return reply.getItem().get();
				else
					throw new NotFound(String.format("No item found for id %s", id));
			});
		};
	}

	@Override
	public ServiceCall<NotUsed, PSequence<Item>> getAllItems() {
		return (req) -> {
			// LOGGER.info("Looking up all items");
			CompletionStage<PSequence<Item>> result = db
					.selectAll("SELECT itemId, userId, name, description, photo, price FROM item").thenApply(rows -> {
						List<Item> items = rows.stream()
								.map(row -> Item.of(row.getUUID("itemId"), row.getString("userId"),
										row.getString("name"), row.getString("description"), row.getString("photo"),
										row.getDecimal("price")))
								.collect(Collectors.toList());
						return TreePVector.from(items);
					});
			return result;
		};
	}
	
	@Override
	public ServiceCall<NotUsed, PSequence<Item>> getAllItemsBy(String userId) {
		return (req) -> {
			// LOGGER.info("Looking up all items");
			CompletionStage<PSequence<Item>> result = db
					.selectAll("SELECT * FROM item where userId = ? ALLOW FILTERING",userId).thenApply(rows -> {
						List<Item> items = rows.stream()
								.map(row -> Item.of(row.getUUID("itemId"), row.getString("userId"),
										row.getString("name"), row.getString("description"), row.getString("photo"),
										row.getDecimal("price")))
								.collect(Collectors.toList());
						return TreePVector.from(items);
					});
			return result;
		};
	}

	@Override
	public ServiceCall<CreateItemRequest, CreateItemResponse> createItem() {
		return request -> {
			LOGGER.info("Creating item: {}", request);
			UUID uuid = UUID.randomUUID();
			return persistentEntities.refFor(ItemEntity.class, uuid.toString()).ask(CreateItem.of(request));
		};
	}

	@Override
	public ServiceCall<NotUsed, ByteString> getImage(String id) {
		final Item item = itemGet(id);
		return req -> {
			try {
				String filename = "images/image_" + id + "_" + item.getPhoto();
				File file = new File(filename);
				FileInputStream is = new FileInputStream(file);
				int noOfBytes = is.available();
				byte[] array = new byte[noOfBytes];
				is.read(array);
				is.close();
				ByteString bytes = ByteString.fromArray(array);
				return completedFuture(bytes);
			} catch (Exception ex) {
			}
			return completedFuture(null);
		};
	}

	private Item itemGet(String id) {
		CompletionStage<Item> stage = persistentEntities.refFor(ItemEntity.class, id).ask(GetItem.of())
				.thenApply(reply -> {
					if (reply.getItem().isPresent())
						return reply.getItem().get();
					else
						throw new NotFound(String.format("No item found for id %s", id));
				});
		Item item = null;
		try {
			item = (Item) stage.toCompletableFuture().get();
		} catch (Exception ex) {
		}
		return item;
	}

	@Override
	// public ServiceCall<String, String> createImage() {
	public ServiceCall<ByteString, String> createImage(String id) {

		final Item item = itemGet(id);
		return request -> {

			ByteString bytes = (ByteString) request;

			try {
				String filename = "images/image_" + id + "_" + item.getPhoto();
				File file = new File(filename);
				if (file.exists())
					file.delete();
				file.createNewFile();
				final FileOutputStream outputStream = new FileOutputStream(file);
				outputStream.write(bytes.toArray());

				outputStream.flush();
				outputStream.close();

				// // // The sink that writes to the output stream
				// Sink<ByteString, CompletionStage<Done>> sink = Sink
				// .<ByteString>foreach(bytes ->
				// outputStream.write(bytes.toArray()));
				// //
				// return
				// completedFuture(Accumulator.fromSink(sink)).thenCompose(r ->
				// {
				// try {
				// outputStream.flush();
				// outputStream.close();
				// } catch (Exception ex) {
				// }
				// return completedFuture((Accumulator<ByteString, Done>) r);
				// });
				// outputStream.write(request.getBytes());

				// return completedFuture(request);
				return completedFuture("Uploaded!");
			} catch (Exception ex) {

			}
			return completedFuture(null);
		};
	}
}