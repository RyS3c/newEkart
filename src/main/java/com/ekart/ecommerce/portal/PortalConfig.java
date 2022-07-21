package com.ekart.ecommerce.portal;

import com.ekart.ecommerce.sales.order.PlaceOrder;
import com.ekart.ecommerce.shipping.delivery.PrepareDelivery;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration for Portal component.
 */
@Configuration
class PortalConfig {

    @Bean
    PlaceOrderFromCart placeOrderFromCart(PlaceOrder placeOrder) {
        return new PlaceOrderFromCart(placeOrder);
    }

    @Bean
    PrepareOrderDelivery prepareOrderDelivery(PrepareDelivery prepareDelivery) {
        return new PrepareOrderDelivery(prepareDelivery);
    }
}
