package elnushop.item.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link AbstractItem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code Item.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code Item.of()}.
 */
@SuppressWarnings("all")
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "AbstractItem"})
@Immutable
public final class Item implements AbstractItem {
  private final UUID id;
  private final String userId;
  private final String name;
  private final String description;
  private final String photo;
  private final BigDecimal price;

  private Item(
      UUID id,
      String userId,
      String name,
      String description,
      String photo,
      BigDecimal price) {
    this.id = Preconditions.checkNotNull(id, "id");
    this.userId = Preconditions.checkNotNull(userId, "userId");
    this.name = Preconditions.checkNotNull(name, "name");
    this.description = Preconditions.checkNotNull(description, "description");
    this.photo = Preconditions.checkNotNull(photo, "photo");
    this.price = Preconditions.checkNotNull(price, "price");
  }

  private Item(
      Item original,
      UUID id,
      String userId,
      String name,
      String description,
      String photo,
      BigDecimal price) {
    this.id = id;
    this.userId = userId;
    this.name = name;
    this.description = description;
    this.photo = photo;
    this.price = price;
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
   * @return The value of the {@code userId} attribute
   */
  @JsonProperty
  @Override
  public String getUserId() {
    return userId;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty
  @Override
  public String getName() {
    return name;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty
  @Override
  public String getDescription() {
    return description;
  }

  /**
   * @return The value of the {@code photo} attribute
   */
  @JsonProperty
  @Override
  public String getPhoto() {
    return photo;
  }

  /**
   * @return The value of the {@code price} attribute
   */
  @JsonProperty
  @Override
  public BigDecimal getPrice() {
    return price;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AbstractItem#getId() id} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for id
   * @return A modified copy of the {@code this} object
   */
  public final Item withId(UUID value) {
    if (this.id == value) return this;
    return validate(new Item(
        this,
        Preconditions.checkNotNull(value, "id"),
        this.userId,
        this.name,
        this.description,
        this.photo,
        this.price));
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AbstractItem#getUserId() userId} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for userId
   * @return A modified copy of the {@code this} object
   */
  public final Item withUserId(String value) {
    if (this.userId.equals(value)) return this;
    return validate(new Item(
        this,
        this.id,
        Preconditions.checkNotNull(value, "userId"),
        this.name,
        this.description,
        this.photo,
        this.price));
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AbstractItem#getName() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final Item withName(String value) {
    if (this.name.equals(value)) return this;
    return validate(new Item(
        this,
        this.id,
        this.userId,
        Preconditions.checkNotNull(value, "name"),
        this.description,
        this.photo,
        this.price));
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AbstractItem#getDescription() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description
   * @return A modified copy of the {@code this} object
   */
  public final Item withDescription(String value) {
    if (this.description.equals(value)) return this;
    return validate(new Item(
        this,
        this.id,
        this.userId,
        this.name,
        Preconditions.checkNotNull(value, "description"),
        this.photo,
        this.price));
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AbstractItem#getPhoto() photo} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for photo
   * @return A modified copy of the {@code this} object
   */
  public final Item withPhoto(String value) {
    if (this.photo.equals(value)) return this;
    return validate(new Item(
        this,
        this.id,
        this.userId,
        this.name,
        this.description,
        Preconditions.checkNotNull(value, "photo"),
        this.price));
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AbstractItem#getPrice() price} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for price
   * @return A modified copy of the {@code this} object
   */
  public final Item withPrice(BigDecimal value) {
    if (this.price == value) return this;
    return validate(new Item(
        this,
        this.id,
        this.userId,
        this.name,
        this.description,
        this.photo,
        Preconditions.checkNotNull(value, "price")));
  }

  /**
   * This instance is equal to all instances of {@code Item} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof Item
        && equalTo((Item) another);
  }

  private boolean equalTo(Item another) {
    return id.equals(another.id)
        && userId.equals(another.userId)
        && name.equals(another.name)
        && description.equals(another.description)
        && photo.equals(another.photo)
        && price.equals(another.price);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code userId}, {@code name}, {@code description}, {@code photo}, {@code price}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + id.hashCode();
    h = h * 17 + userId.hashCode();
    h = h * 17 + name.hashCode();
    h = h * 17 + description.hashCode();
    h = h * 17 + photo.hashCode();
    h = h * 17 + price.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Item...} with all non-generated
   * and non-auxiliary attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Item")
        .add("id", id)
        .add("userId", userId)
        .add("name", name)
        .add("description", description)
        .add("photo", photo)
        .add("price", price)
        .toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonDeserialize
  static final class Json implements AbstractItem {
    @Nullable UUID id;
    @Nullable String userId;
    @Nullable String name;
    @Nullable String description;
    @Nullable String photo;
    @Nullable BigDecimal price;
    @JsonProperty
    public void setId(UUID id) {
      this.id = id;
    }
    @JsonProperty
    public void setUserId(String userId) {
      this.userId = userId;
    }
    @JsonProperty
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty
    public void setDescription(String description) {
      this.description = description;
    }
    @JsonProperty
    public void setPhoto(String photo) {
      this.photo = photo;
    }
    @JsonProperty
    public void setPrice(BigDecimal price) {
      this.price = price;
    }
    @Override
    public UUID getId() { throw new UnsupportedOperationException(); }
    @Override
    public String getUserId() { throw new UnsupportedOperationException(); }
    @Override
    public String getName() { throw new UnsupportedOperationException(); }
    @Override
    public String getDescription() { throw new UnsupportedOperationException(); }
    @Override
    public String getPhoto() { throw new UnsupportedOperationException(); }
    @Override
    public BigDecimal getPrice() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator
  static Item fromJson(Json json) {
    Item.Builder builder = Item.builder();
    if (json.id != null) {
      builder.id(json.id);
    }
    if (json.userId != null) {
      builder.userId(json.userId);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.description != null) {
      builder.description(json.description);
    }
    if (json.photo != null) {
      builder.photo(json.photo);
    }
    if (json.price != null) {
      builder.price(json.price);
    }
    return builder.build();
  }

  /**
   * Construct a new immutable {@code Item} instance.
   * @param id The value for the {@code id} attribute
   * @param userId The value for the {@code userId} attribute
   * @param name The value for the {@code name} attribute
   * @param description The value for the {@code description} attribute
   * @param photo The value for the {@code photo} attribute
   * @param price The value for the {@code price} attribute
   * @return An immutable Item instance
   */
  public static Item of(UUID id, String userId, String name, String description, String photo, BigDecimal price) {
    return validate(new Item(id, userId, name, description, photo, price));
  }

  private static Item validate(Item instance) {
    instance.check();
    return instance;
  }

  /**
   * Creates an immutable copy of a {@link AbstractItem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Item instance
   */
  public static Item copyOf(AbstractItem instance) {
    if (instance instanceof Item) {
      return (Item) instance;
    }
    return Item.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link Item Item}.
   * @return A new Item builder
   */
  public static Item.Builder builder() {
    return new Item.Builder();
  }

  /**
   * Builds instances of type {@link Item Item}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ID = 0x1L;
    private static final long INIT_BIT_USER_ID = 0x2L;
    private static final long INIT_BIT_NAME = 0x4L;
    private static final long INIT_BIT_DESCRIPTION = 0x8L;
    private static final long INIT_BIT_PHOTO = 0x10L;
    private static final long INIT_BIT_PRICE = 0x20L;
    private long initBits = 0x3f;

    private @Nullable UUID id;
    private @Nullable String userId;
    private @Nullable String name;
    private @Nullable String description;
    private @Nullable String photo;
    private @Nullable BigDecimal price;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AbstractItem} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AbstractItem instance) {
      Preconditions.checkNotNull(instance, "instance");
      id(instance.getId());
      userId(instance.getUserId());
      name(instance.getName());
      description(instance.getDescription());
      photo(instance.getPhoto());
      price(instance.getPrice());
      return this;
    }

    /**
     * Initializes the value for the {@link AbstractItem#getId() id} attribute.
     * @param id The value for id 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder id(UUID id) {
      this.id = Preconditions.checkNotNull(id, "id");
      initBits &= ~INIT_BIT_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link AbstractItem#getUserId() userId} attribute.
     * @param userId The value for userId 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder userId(String userId) {
      this.userId = Preconditions.checkNotNull(userId, "userId");
      initBits &= ~INIT_BIT_USER_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link AbstractItem#getName() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Preconditions.checkNotNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link AbstractItem#getDescription() description} attribute.
     * @param description The value for description 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder description(String description) {
      this.description = Preconditions.checkNotNull(description, "description");
      initBits &= ~INIT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the value for the {@link AbstractItem#getPhoto() photo} attribute.
     * @param photo The value for photo 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder photo(String photo) {
      this.photo = Preconditions.checkNotNull(photo, "photo");
      initBits &= ~INIT_BIT_PHOTO;
      return this;
    }

    /**
     * Initializes the value for the {@link AbstractItem#getPrice() price} attribute.
     * @param price The value for price 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder price(BigDecimal price) {
      this.price = Preconditions.checkNotNull(price, "price");
      initBits &= ~INIT_BIT_PRICE;
      return this;
    }

    /**
     * Builds a new {@link Item Item}.
     * @return An immutable instance of Item
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Item build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return Item.validate(new Item(null, id, userId, name, description, photo, price));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_ID) != 0) attributes.add("id");
      if ((initBits & INIT_BIT_USER_ID) != 0) attributes.add("userId");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_DESCRIPTION) != 0) attributes.add("description");
      if ((initBits & INIT_BIT_PHOTO) != 0) attributes.add("photo");
      if ((initBits & INIT_BIT_PRICE) != 0) attributes.add("price");
      return "Cannot build Item, some of required attributes are not set " + attributes;
    }
  }
}
