package com.ekart.ecommerce.sales.order;

import java.util.List;

import com.ekart.ecommerce.common.primitives.Money;
import com.ekart.ecommerce.sales.order.item.OrderItem;

/**
 * Order entity.
 */
public interface Order {

    OrderId id();

    List<OrderItem> items();

    Money total();

    /**
     * OrderHasNoItemsException is thrown when the Order has no items.
     */
    final class OrderHasNoItemsException extends IllegalStateException {
    }
}
