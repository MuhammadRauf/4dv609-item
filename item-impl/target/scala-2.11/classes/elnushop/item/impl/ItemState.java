package elnushop.item.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import elnushop.item.api.Item;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link AbstractItemState}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ItemState.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ItemState.of()}.
 */
@SuppressWarnings("all")
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AbstractItemState"})
@Immutable
public final class ItemState implements AbstractItemState {
  private final @Nullable Item item;
  private final LocalDateTime timestamp;

  private ItemState(Optional<Item> item, LocalDateTime timestamp) {
    this.item = item.orElse(null);
    this.timestamp = Preconditions.checkNotNull(timestamp, "timestamp");
  }

  private ItemState(
      ItemState original,
      @Nullable Item item,
      LocalDateTime timestamp) {
    this.item = item;
    this.timestamp = timestamp;
  }

  /**
   * @return The value of the {@code item} attribute
   */
  @JsonProperty
  @Override
  public Optional<Item> getItem() {
    return Optional.ofNullable(item);
  }

  /**
   * @return The value of the {@code timestamp} attribute
   */
  @JsonProperty
  @Override
  public LocalDateTime getTimestamp() {
    return timestamp;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AbstractItemState#getItem() item} attribute.
   * @param value The value for item
   * @return A modified copy of {@code this} object
   */
  public final ItemState withItem(Item value) {
    @Nullable Item newValue = Preconditions.checkNotNull(value, "item");
    if (this.item == newValue) return this;
    return new ItemState(this, newValue, this.timestamp);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AbstractItemState#getItem() item} attribute.
   * @param optional A value for item
   * @return A modified copy of {@code this} object
   */
  public final ItemState withItem(Optional<Item> optional) {
    @Nullable Item value = optional.orElse(null);
    if (this.item == value) return this;
    return new ItemState(this, value, this.timestamp);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AbstractItemState#getTimestamp() timestamp} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for timestamp
   * @return A modified copy of the {@code this} object
   */
  public final ItemState withTimestamp(LocalDateTime value) {
    if (this.timestamp == value) return this;
    return new ItemState(this, this.item, Preconditions.checkNotNull(value, "timestamp"));
  }

  /**
   * This instance is equal to all instances of {@code ItemState} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ItemState
        && equalTo((ItemState) another);
  }

  private boolean equalTo(ItemState another) {
    return Objects.equal(item, another.item)
        && timestamp.equals(another.timestamp);
  }

  /**
   * Computes a hash code from attributes: {@code item}, {@code timestamp}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + Objects.hashCode(item);
    h = h * 17 + timestamp.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ItemState...} with all non-generated
   * and non-auxiliary attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ItemState")
        .add("item", getItem())
        .add("timestamp", timestamp)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  static final class Json implements AbstractItemState {
    Optional<Item> item = Optional.empty();
    @Nullable LocalDateTime timestamp;
    @JsonProperty
    public void setItem(Optional<Item> item) {
      this.item = item;
    }
    @JsonProperty
    public void setTimestamp(LocalDateTime timestamp) {
      this.timestamp = timestamp;
    }
    @Override
    public Optional<Item> getItem() { throw new UnsupportedOperationException(); }
    @Override
    public LocalDateTime getTimestamp() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator
  static ItemState fromJson(Json json) {
    ItemState.Builder builder = ItemState.builder();
    if (json.item != null) {
      builder.item(json.item);
    }
    if (json.timestamp != null) {
      builder.timestamp(json.timestamp);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code ItemState} instance.
   * @param item The value for the {@code item} attribute
   * @param timestamp The value for the {@code timestamp} attribute
   * @return An immutable ItemState instance
   */
  public static ItemState of(Optional<Item> item, LocalDateTime timestamp) {
    return new ItemState(item, timestamp);
  }

  /**
   * Creates an immutable copy of a {@link AbstractItemState} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ItemState instance
   */
  public static ItemState copyOf(AbstractItemState instance) {
    if (instance instanceof ItemState) {
      return (ItemState) instance;
    }
    return ItemState.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ItemState ItemState}.
   * @return A new ItemState builder
   */
  public static ItemState.Builder builder() {
    return new ItemState.Builder();
  }

  /**
   * Builds instances of type {@link ItemState ItemState}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TIMESTAMP = 0x1L;
    private long initBits = 0x1;

    private @Nullable Item item;
    private @Nullable LocalDateTime timestamp;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AbstractItemState} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AbstractItemState instance) {
      Preconditions.checkNotNull(instance, "instance");
      Optional<Item> itemOptional = instance.getItem();
      if (itemOptional.isPresent()) {
        item(itemOptional);
      }
      timestamp(instance.getTimestamp());
      return this;
    }

    /**
     * Initializes the optional value {@link AbstractItemState#getItem() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    public final Builder item(Item item) {
      this.item = Preconditions.checkNotNull(item, "item");
      return this;
    }

    /**
     * Initializes the optional value {@link AbstractItemState#getItem() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder item(Optional<Item> item) {
      this.item = item.orElse(null);
      return this;
    }

    /**
     * Initializes the value for the {@link AbstractItemState#getTimestamp() timestamp} attribute.
     * @param timestamp The value for timestamp 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder timestamp(LocalDateTime timestamp) {
      this.timestamp = Preconditions.checkNotNull(timestamp, "timestamp");
      initBits &= ~INIT_BIT_TIMESTAMP;
      return this;
    }

    /**
     * Builds a new {@link ItemState ItemState}.
     * @return An immutable instance of ItemState
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ItemState build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ItemState(null, item, timestamp);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TIMESTAMP) != 0) attributes.add("timestamp");
      return "Cannot build ItemState, some of required attributes are not set " + attributes;
    }
  }
}
