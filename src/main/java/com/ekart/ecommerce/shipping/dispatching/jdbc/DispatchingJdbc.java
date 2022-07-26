package com.ekart.ecommerce.shipping.dispatching.jdbc;

import java.time.Instant;

import com.ekart.ecommerce.common.events.EventPublisher;
import com.ekart.ecommerce.shipping.dispatching.DeliveryDispatched;
import com.ekart.ecommerce.shipping.dispatching.Dispatching;
import com.ekart.ecommerce.shipping.dispatching.OrderId;

import org.springframework.transaction.annotation.Transactional;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class DispatchingJdbc implements Dispatching {

    private final @NonNull EventPublisher eventPublisher;

    @Transactional
    public void dispatch(OrderId orderId) {

        // do the actual dispatching...

        log.info("Order {} is being dispatched.", orderId);

        eventPublisher.raise(new DeliveryDispatched(Instant.now(), orderId.value()));
    }
}
