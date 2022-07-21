package com.ekart.ecommerce.shipping.delivery.jdbc;

import com.ekart.ecommerce.common.events.EventPublisher;
import com.ekart.ecommerce.shipping.delivery.Address;
import com.ekart.ecommerce.shipping.delivery.Delivery;
import com.ekart.ecommerce.shipping.delivery.OrderId;
import com.ekart.ecommerce.shipping.delivery.PrepareDelivery;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * JDBC implementation for Prepare Delivery use-cases.
 */
@RequiredArgsConstructor
@Slf4j
class PrepareDeliveryJdbc implements PrepareDelivery {

    private final @NonNull JdbcTemplate jdbcTemplate;
    private final @NonNull EventPublisher eventPublisher;

    @Transactional
    @Override
    public void prepare(@NonNull OrderId orderId, @NonNull Address address) {
        Delivery delivery = new DeliveryJdbc(orderId, address, jdbcTemplate, eventPublisher);
        delivery.prepare();
    }
}
