package elnushop.item.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import elnushop.item.api.Item;
import java.time.Instant;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link ItemEvent.AbstractItemCreated}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ItemCreated.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ItemCreated.of()}.
 */
@SuppressWarnings("all")
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ItemEvent.AbstractItemCreated"})
@Immutable
public final class ItemCreated implements ItemEvent.AbstractItemCreated {
  private final Item item;
  private final Instant timestamp;

  private ItemCreated(Item item) {
    this.item = Preconditions.checkNotNull(item, "item");
    this.timestamp = Preconditions.checkNotNull(ItemEvent.AbstractItemCreated.super.getTimestamp(), "timestamp");
  }

  private ItemCreated(ItemCreated.Builder builder) {
    this.item = builder.item;
    this.timestamp = builder.timestamp != null
        ? builder.timestamp
        : Preconditions.checkNotNull(ItemEvent.AbstractItemCreated.super.getTimestamp(), "timestamp");
  }

  private ItemCreated(Item item, Instant timestamp) {
    this.item = item;
    this.timestamp = timestamp;
  }

  /**
   * @return The value of the {@code item} attribute
   */
  @JsonProperty
  @Override
  public Item getItem() {
    return item;
  }

  /**
   * @return The value of the {@code timestamp} attribute
   */
  @JsonProperty
  @Override
  public Instant getTimestamp() {
    return timestamp;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ItemEvent.AbstractItemCreated#getItem() item} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for item
   * @return A modified copy of the {@code this} object
   */
  public final ItemCreated withItem(Item value) {
    if (this.item == value) return this;
    return new ItemCreated(Preconditions.checkNotNull(value, "item"), this.timestamp);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ItemEvent.AbstractItemCreated#getTimestamp() timestamp} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for timestamp
   * @return A modified copy of the {@code this} object
   */
  public final ItemCreated withTimestamp(Instant value) {
    if (this.timestamp == value) return this;
    return new ItemCreated(this.item, Preconditions.checkNotNull(value, "timestamp"));
  }

  /**
   * This instance is equal to all instances of {@code ItemCreated} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ItemCreated
        && equalTo((ItemCreated) another);
  }

  private boolean equalTo(ItemCreated another) {
    return item.equals(another.item)
        && timestamp.equals(another.timestamp);
  }

  /**
   * Computes a hash code from attributes: {@code item}, {@code timestamp}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + item.hashCode();
    h = h * 17 + timestamp.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ItemCreated...} with all non-generated
   * and non-auxiliary attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ItemCreated")
        .add("item", item)
        .add("timestamp", timestamp)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  static final class Json implements ItemEvent.AbstractItemCreated {
    @Nullable Item item;
    @Nullable Instant timestamp;
    @JsonProperty
    public void setItem(Item item) {
      this.item = item;
    }
    @JsonProperty
    public void setTimestamp(Instant timestamp) {
      this.timestamp = timestamp;
    }
    @Override
    public Item getItem() { throw new UnsupportedOperationException(); }
    @Override
    public Instant getTimestamp() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator
  static ItemCreated fromJson(Json json) {
    ItemCreated.Builder builder = ItemCreated.builder();
    if (json.item != null) {
      builder.item(json.item);
    }
    if (json.timestamp != null) {
      builder.timestamp(json.timestamp);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code ItemCreated} instance.
   * @param item The value for the {@code item} attribute
   * @return An immutable ItemCreated instance
   */
  public static ItemCreated of(Item item) {
    return new ItemCreated(item);
  }

  /**
   * Creates an immutable copy of a {@link ItemEvent.AbstractItemCreated} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ItemCreated instance
   */
  public static ItemCreated copyOf(ItemEvent.AbstractItemCreated instance) {
    if (instance instanceof ItemCreated) {
      return (ItemCreated) instance;
    }
    return ItemCreated.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ItemCreated ItemCreated}.
   * @return A new ItemCreated builder
   */
  public static ItemCreated.Builder builder() {
    return new ItemCreated.Builder();
  }

  /**
   * Builds instances of type {@link ItemCreated ItemCreated}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ITEM = 0x1L;
    private long initBits = 0x1;

    private @Nullable Item item;
    private @Nullable Instant timestamp;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AbstractItemCreated} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ItemEvent.AbstractItemCreated instance) {
      Preconditions.checkNotNull(instance, "instance");
      item(instance.getItem());
      timestamp(instance.getTimestamp());
      return this;
    }

    /**
     * Initializes the value for the {@link ItemEvent.AbstractItemCreated#getItem() item} attribute.
     * @param item The value for item 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder item(Item item) {
      this.item = Preconditions.checkNotNull(item, "item");
      initBits &= ~INIT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the value for the {@link ItemEvent.AbstractItemCreated#getTimestamp() timestamp} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link ItemEvent.AbstractItemCreated#getTimestamp() timestamp}.</em>
     * @param timestamp The value for timestamp 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder timestamp(Instant timestamp) {
      this.timestamp = Preconditions.checkNotNull(timestamp, "timestamp");
      return this;
    }

    /**
     * Builds a new {@link ItemCreated ItemCreated}.
     * @return An immutable instance of ItemCreated
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ItemCreated build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ItemCreated(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_ITEM) != 0) attributes.add("item");
      return "Cannot build ItemCreated, some of required attributes are not set " + attributes;
    }
  }
}
