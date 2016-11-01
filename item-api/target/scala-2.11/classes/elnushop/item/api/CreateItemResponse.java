package elnushop.item.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.UUID;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link AbstractCreateItemResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code CreateItemResponse.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code CreateItemResponse.of()}.
 */
@SuppressWarnings("all")
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AbstractCreateItemResponse"})
@Immutable
public final class CreateItemResponse implements AbstractCreateItemResponse {
  private final UUID id;

  private CreateItemResponse(UUID id) {
    this.id = Preconditions.checkNotNull(id, "id");
  }

  private CreateItemResponse(CreateItemResponse original, UUID id) {
    this.id = id;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty
  @Override
  public UUID getId() {
    return id;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AbstractCreateItemResponse#getId() id} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final CreateItemResponse withId(UUID value) {
    if (this.id == value) return this;
    return new CreateItemResponse(this, Preconditions.checkNotNull(value, "id"));
  }

  /**
   * This instance is equal to all instances of {@code CreateItemResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof CreateItemResponse
        && equalTo((CreateItemResponse) another);
  }

  private boolean equalTo(CreateItemResponse another) {
    return id.equals(another.id);
  }

  /**
   * Computes a hash code from attributes: {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + id.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code CreateItemResponse...} with all non-generated
   * and non-auxiliary attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("CreateItemResponse")
        .add("id", id)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  static final class Json implements AbstractCreateItemResponse {
    @Nullable UUID id;
    @JsonProperty
    public void setId(UUID id) {
      this.id = id;
    }
    @Override
    public UUID getId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator
  static CreateItemResponse fromJson(Json json) {
    CreateItemResponse.Builder builder = CreateItemResponse.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code CreateItemResponse} instance.
   * @param id The value for the {@code id} attribute
   * @return An immutable CreateItemResponse instance
   */
  public static CreateItemResponse of(UUID id) {
    return new CreateItemResponse(id);
  }

  /**
   * Creates an immutable copy of a {@link AbstractCreateItemResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CreateItemResponse instance
   */
  public static CreateItemResponse copyOf(AbstractCreateItemResponse instance) {
    if (instance instanceof CreateItemResponse) {
      return (CreateItemResponse) instance;
    }
    return CreateItemResponse.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link CreateItemResponse CreateItemResponse}.
   * @return A new CreateItemResponse builder
   */
  public static CreateItemResponse.Builder builder() {
    return new CreateItemResponse.Builder();
  }

  /**
   * Builds instances of type {@link CreateItemResponse CreateItemResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private long initBits = 0x1;

    private @Nullable UUID id;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AbstractCreateItemResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AbstractCreateItemResponse instance) {
      Preconditions.checkNotNull(instance, "instance");
      id(instance.getId());
      return this;
    }

    /**
     * Initializes the value for the {@link AbstractCreateItemResponse#getId() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder id(UUID id) {
      this.id = Preconditions.checkNotNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Builds a new {@link CreateItemResponse CreateItemResponse}.
     * @return An immutable instance of CreateItemResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CreateItemResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new CreateItemResponse(null, id);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      return "Cannot build CreateItemResponse, some of required attributes are not set " + attributes;
    }
  }
}
