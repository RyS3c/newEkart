package com.ekart.ecommerce.shipping.delivery;

import java.util.stream.Stream;

/**
 * Delivery Info collection.
 */
public interface DeliveryInfos {

    Stream<DeliveryInfo> stream();
}
