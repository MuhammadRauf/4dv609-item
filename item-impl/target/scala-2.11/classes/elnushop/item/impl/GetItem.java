package elnushop.item.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.google.common.base.Preconditions;
import java.io.ObjectStreamException;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link ItemCommand.AbstractGetItem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code GetItem.builder()}.
 * Use the static factory method to get the default singleton instance:
 * {@code GetItem.of()}.
 */
@SuppressWarnings("all")
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ItemCommand.AbstractGetItem"})
@Immutable
public final class GetItem implements ItemCommand.AbstractGetItem {

  private GetItem() {}

  /**
   * This instance is equal to all instances of {@code GetItem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof GetItem
        && equalTo((GetItem) another);
  }

  private boolean equalTo(GetItem another) {
    return true;
  }

  /**
   * Returns a constant hash code value.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    return -1489245549;
  }

  /**
   * Prints the immutable value {@code GetItem...} with all non-generated
   * and non-auxiliary attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "GetItem{}";
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator
  static GetItem fromJson(Map<String, Object> json) {
    GetItem.Builder builder = GetItem.builder();
    return builder.build();
  }

  private static final GetItem INSTANCE = validate(new GetItem());

  /**
   * Returns the default immutable singleton value of {@code GetItem}
   * @return An immutable instance of GetItem
   */
  public static GetItem of() {
    return INSTANCE;
  }

  private static GetItem validate(GetItem instance) {
    return INSTANCE != null && INSTANCE.equalTo(instance) ? INSTANCE : instance;
  }

  private Object readResolve() throws ObjectStreamException {
    return validate(this);
  }

  /**
   * Creates a builder for {@link GetItem GetItem}.
   * @return A new GetItem builder
   */
  public static GetItem.Builder builder() {
    return new GetItem.Builder();
  }

  /**
   * Builds instances of type {@link GetItem GetItem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AbstractGetItem} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ItemCommand.AbstractGetItem instance) {
      Preconditions.checkNotNull(instance, "instance");
      return this;
    }

    /**
     * Builds a new {@link GetItem GetItem}.
     * @return An immutable instance of GetItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public GetItem build() {
      return GetItem.of();
    }
  }
}
