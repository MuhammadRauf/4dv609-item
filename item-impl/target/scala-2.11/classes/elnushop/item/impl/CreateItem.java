package elnushop.item.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import elnushop.item.api.CreateItemRequest;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link ItemCommand.AbstractCreateItem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code CreateItem.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code CreateItem.of()}.
 */
@SuppressWarnings("all")
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ItemCommand.AbstractCreateItem"})
@Immutable
public final class CreateItem implements ItemCommand.AbstractCreateItem {
  private final CreateItemRequest createItemRequest;

  private CreateItem(CreateItemRequest createItemRequest) {
    this.createItemRequest = Preconditions.checkNotNull(createItemRequest, "createItemRequest");
  }

  private CreateItem(CreateItem original, CreateItemRequest createItemRequest) {
    this.createItemRequest = createItemRequest;
  }

  /**
   * @return The value of the {@code createItemRequest} attribute
   */
  @JsonProperty
  @Override
  public CreateItemRequest getCreateItemRequest() {
    return createItemRequest;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ItemCommand.AbstractCreateItem#getCreateItemRequest() createItemRequest} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for createItemRequest
   * @return A modified copy of the {@code this} object
   */
  public final CreateItem withCreateItemRequest(CreateItemRequest value) {
    if (this.createItemRequest == value) return this;
    return new CreateItem(this, Preconditions.checkNotNull(value, "createItemRequest"));
  }

  /**
   * This instance is equal to all instances of {@code CreateItem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof CreateItem
        && equalTo((CreateItem) another);
  }

  private boolean equalTo(CreateItem another) {
    return createItemRequest.equals(another.createItemRequest);
  }

  /**
   * Computes a hash code from attributes: {@code createItemRequest}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + createItemRequest.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code CreateItem...} with all non-generated
   * and non-auxiliary attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("CreateItem")
        .add("createItemRequest", createItemRequest)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  static final class Json implements ItemCommand.AbstractCreateItem {
    @Nullable CreateItemRequest createItemRequest;
    @JsonProperty
    public void setCreateItemRequest(CreateItemRequest createItemRequest) {
      this.createItemRequest = createItemRequest;
    }
    @Override
    public CreateItemRequest getCreateItemRequest() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator
  static CreateItem fromJson(Json json) {
    CreateItem.Builder builder = CreateItem.builder();
    if (json.createItemRequest != null) {
      builder.createItemRequest(json.createItemRequest);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code CreateItem} instance.
   * @param createItemRequest The value for the {@code createItemRequest} attribute
   * @return An immutable CreateItem instance
   */
  public static CreateItem of(CreateItemRequest createItemRequest) {
    return new CreateItem(createItemRequest);
  }

  /**
   * Creates an immutable copy of a {@link ItemCommand.AbstractCreateItem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CreateItem instance
   */
  public static CreateItem copyOf(ItemCommand.AbstractCreateItem instance) {
    if (instance instanceof CreateItem) {
      return (CreateItem) instance;
    }
    return CreateItem.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link CreateItem CreateItem}.
   * @return A new CreateItem builder
   */
  public static CreateItem.Builder builder() {
    return new CreateItem.Builder();
  }

  /**
   * Builds instances of type {@link CreateItem CreateItem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CREATE_ITEM_REQUEST = 0x1L;
    private long initBits = 0x1;

    private @Nullable CreateItemRequest createItemRequest;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AbstractCreateItem} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ItemCommand.AbstractCreateItem instance) {
      Preconditions.checkNotNull(instance, "instance");
      createItemRequest(instance.getCreateItemRequest());
      return this;
    }

    /**
     * Initializes the value for the {@link ItemCommand.AbstractCreateItem#getCreateItemRequest() createItemRequest} attribute.
     * @param createItemRequest The value for createItemRequest 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder createItemRequest(CreateItemRequest createItemRequest) {
      this.createItemRequest = Preconditions.checkNotNull(createItemRequest, "createItemRequest");
      initBits &= ~INIT_BIT_CREATE_ITEM_REQUEST;
      return this;
    }

    /**
     * Builds a new {@link CreateItem CreateItem}.
     * @return An immutable instance of CreateItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CreateItem build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new CreateItem(null, createItemRequest);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CREATE_ITEM_REQUEST) != 0) attributes.add("createItemRequest");
      return "Cannot build CreateItem, some of required attributes are not set " + attributes;
    }
  }
}
