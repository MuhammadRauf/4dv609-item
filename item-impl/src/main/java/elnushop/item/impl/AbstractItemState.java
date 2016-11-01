package elnushop.item.impl;

import elnushop.item.api.CreateItemRequest;
import elnushop.item.api.CreateItemResponse;
import elnushop.item.api.Item;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.lightbend.lagom.javadsl.immutable.ImmutableStyle;
import com.lightbend.lagom.serialization.Jsonable;
import org.immutables.value.Value;

import java.time.LocalDateTime;
import java.util.Optional;

@Value.Immutable
@ImmutableStyle
@JsonDeserialize
public interface AbstractItemState extends Jsonable {

    @Value.Parameter
    Optional<Item> getItem();

    @Value.Parameter
    LocalDateTime getTimestamp();
}
