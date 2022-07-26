package com.ekart.ecommerce.shipping.delivery.listeners;

import com.ekart.ecommerce.shipping.delivery.DispatchDelivery;
import com.ekart.ecommerce.shipping.delivery.OrderId;
import com.ekart.ecommerce.shipping.dispatching.DeliveryDispatched;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
class DeliveryDispatchedListener {

    private final @NonNull DispatchDelivery dispatchDelivery;

    @TransactionalEventListener
    @Async
    public void on(DeliveryDispatched event) {
        dispatchDelivery.byOrder(new OrderId(event.orderId));
    }
}
