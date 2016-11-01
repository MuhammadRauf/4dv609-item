package elnushop.item.impl;

import elnushop.item.api.CreateItemRequest;
import elnushop.item.api.CreateItemResponse;
import elnushop.item.api.Item;

import com.lightbend.lagom.javadsl.persistence.AggregateEventTag;

public class ItemEventTag {
    public static final AggregateEventTag<ItemEvent> INSTANCE =
            AggregateEventTag.of(ItemEvent.class);
}
