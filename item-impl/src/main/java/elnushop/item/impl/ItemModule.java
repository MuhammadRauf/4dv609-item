package elnushop.item.impl;

import elnushop.item.api.CreateItemRequest;
import elnushop.item.api.CreateItemResponse;
import elnushop.item.api.Item;
import elnushop.item.api.ItemService;

import com.google.inject.AbstractModule;
import com.lightbend.lagom.javadsl.server.ServiceGuiceSupport;

public class ItemModule extends AbstractModule implements ServiceGuiceSupport {

    @Override
    protected void configure() {
        bindServices(serviceBinding(
                ItemService.class, ItemServiceImpl.class));
    }
}
