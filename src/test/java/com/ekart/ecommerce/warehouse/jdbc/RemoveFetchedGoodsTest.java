package com.ekart.ecommerce.warehouse.jdbc;

import com.ekart.ecommerce.common.events.EventPublisher;
import com.ekart.ecommerce.warehouse.RemoveFetchedGoods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;

@JdbcTest
@ContextConfiguration(classes = WarehouseJdbcConfig.class)
class RemoveFetchedGoodsTest {

    @Autowired
    private RemoveFetchedGoods removeFetchedGoods;

    @MockBean
    private EventPublisher eventPublisher;

    // TODO
}
