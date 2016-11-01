package elnushop.item.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import elnushop.item.api.Item;
import java.util.Optional;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link ItemCommand.AbstractGetItemReply}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code GetItemReply.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code GetItemReply.of()}.
 */
@SuppressWarnings("all")
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ItemCommand.AbstractGetItemReply"})
@Immutable
public final class GetItemReply implements ItemCommand.AbstractGetItemReply {
  private final @Nullable Item item;

  private GetItemReply(Optional<Item> item) {
    this.item = item.orElse(null);
  }

  private GetItemReply(GetItemReply original, @Nullable Item item) {
    this.item = item;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ItemCommand.AbstractGetItemReply#getItem() item} attribute.
   * @param value The value for item
   * @return A modified copy of {@code this} object
   */
  public final GetItemReply withItem(Item value) {
    @Nullable Item newValue = Preconditions.checkNotNull(value, "item");
    if (this.item == newValue) return this;
    return new GetItemReply(this, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ItemCommand.AbstractGetItemReply#getItem() item} attribute.
   * @param optional A value for item
   * @return A modified copy of {@code this} object
   */
  public final GetItemReply withItem(Optional<Item> optional) {
    @Nullable Item value = optional.orElse(null);
    if (this.item == value) return this;
    return new GetItemReply(this, value);
  }

  /**
   * This instance is equal to all instances of {@code GetItemReply} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof GetItemReply
        && equalTo((GetItemReply) another);
  }

  private boolean equalTo(GetItemReply another) {
    return Objects.equal(item, another.item);
  }

  /**
   * Computes a hash code from attributes: {@code item}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + Objects.hashCode(item);
    return h;
  }

  /**
   * Prints the immutable value {@code GetItemReply...} with all non-generated
   * and non-auxiliary attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("GetItemReply")
        .add("item", getItem())
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  static final class Json implements ItemCommand.AbstractGetItemReply {
    Optional<Item> item = Optional.empty();
    @JsonProperty
    public void setItem(Optional<Item> item) {
      this.item = item;
    }
    @Override
    public Optional<Item> getItem() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator
  static GetItemReply fromJson(Json json) {
    GetItemReply.Builder builder = GetItemReply.builder();
    if (json.item != null) {
      builder.item(json.item);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code GetItemReply} instance.
   * @param item The value for the {@code item} attribute
   * @return An immutable GetItemReply instance
   */
  public static GetItemReply of(Optional<Item> item) {
    return new GetItemReply(item);
  }

  /**
   * Creates an immutable copy of a {@link ItemCommand.AbstractGetItemReply} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable GetItemReply instance
   */
  public static GetItemReply copyOf(ItemCommand.AbstractGetItemReply instance) {
    if (instance instanceof GetItemReply) {
      return (GetItemReply) instance;
    }
    return GetItemReply.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link GetItemReply GetItemReply}.
   * @return A new GetItemReply builder
   */
  public static GetItemReply.Builder builder() {
    return new GetItemReply.Builder();
  }

  /**
   * Builds instances of type {@link GetItemReply GetItemReply}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private @Nullable Item item;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AbstractGetItemReply} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ItemCommand.AbstractGetItemReply instance) {
      Preconditions.checkNotNull(instance, "instance");
      Optional<Item> itemOptional = instance.getItem();
      if (itemOptional.isPresent()) {
        item(itemOptional);
      }
      return this;
    }

    /**
     * Initializes the optional value {@link ItemCommand.AbstractGetItemReply#getItem() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    public final Builder item(Item item) {
      this.item = Preconditions.checkNotNull(item, "item");
      return this;
    }

    /**
     * Initializes the optional value {@link ItemCommand.AbstractGetItemReply#getItem() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder item(Optional<Item> item) {
      this.item = item.orElse(null);
      return this;
    }

    /**
     * Builds a new {@link GetItemReply GetItemReply}.
     * @return An immutable instance of GetItemReply
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public GetItemReply build() {
      return new GetItemReply(null, item);
    }
  }
}
