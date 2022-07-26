package com.ekart.ecommerce.shipping.dispatching.listeners;

import com.ekart.ecommerce.billing.payment.PaymentCollected;
import com.ekart.ecommerce.shipping.delivery.DeliveryPrepared;
import com.ekart.ecommerce.shipping.dispatching.DispatchingSaga;
import com.ekart.ecommerce.shipping.dispatching.OrderId;
import com.ekart.ecommerce.sales.order.OrderPlaced;
import com.ekart.ecommerce.warehouse.GoodsFetched;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
class DispatchingListeners {

    private final @NonNull DispatchingSaga saga;

    @TransactionalEventListener
    @Async
    public void on(DeliveryPrepared event) {
        saga.prepared(new OrderId(event.orderId));
    }

    @TransactionalEventListener
    @Async
    public void on(OrderPlaced event) {
        saga.accepted(new OrderId(event.orderId));
    }

    @TransactionalEventListener
    @Async
    public void on(GoodsFetched event) {
        saga.fetched(new OrderId(event.orderId));
    }

    @TransactionalEventListener
    @Async
    public void on(PaymentCollected event) {
        saga.paid(new OrderId(event.referenceId));
    }
}
