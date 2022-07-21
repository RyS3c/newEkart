package com.ekart.ecommerce.sales.cart;

import java.util.List;

import com.ekart.ecommerce.sales.cart.item.CartItem;
import com.ekart.ecommerce.sales.cart.item.ProductId;

/**
 * Cart entity.
 */
public interface Cart {

    CartId id();

    List<CartItem> items();

    boolean hasItems();

    void add(CartItem toAdd);

    void remove(ProductId productId);

    void empty();
}
