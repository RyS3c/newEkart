package com.ekart.ecommerce.billing.payment.listeners;

import com.ekart.ecommerce.billing.payment.CollectPayment;
import com.ekart.ecommerce.billing.payment.ReferenceId;
import com.ekart.ecommerce.common.primitives.Money;
import com.ekart.ecommerce.sales.order.OrderPlaced;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Component("payment-orderPlacedListener") // a custom name to avoid collision
@RequiredArgsConstructor
class OrderPlacedListener {

    private final @NonNull CollectPayment collectPayment;

    @TransactionalEventListener
    @Async
    public void on(OrderPlaced event) {
        collectPayment.collect(
                new ReferenceId(event.orderId),
                new Money(event.total));
    }
}
