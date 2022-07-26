package com.ekart.ecommerce.shipping.delivery.jdbc;

import com.ekart.ecommerce.shipping.delivery.Delivery;
import com.ekart.ecommerce.shipping.delivery.DispatchDelivery;
import com.ekart.ecommerce.shipping.delivery.FindDeliveries;
import com.ekart.ecommerce.shipping.delivery.OrderId;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Dispatch Delivery use-case.
 */
@RequiredArgsConstructor
public class DispatchDeliveryJdbc implements DispatchDelivery {

    private final @NonNull FindDeliveries findDeliveries;

    /**
     * Dispatches a delivery by the order ID.
     *
     * @param orderId the order ID
     */
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void byOrder(OrderId orderId) {
        Delivery delivery = findDeliveries.byOrder(orderId);
        delivery.dispatch();
    }
}
