package com.ekart.ecommerce.sales.catalog.jdbc;

import com.ekart.ecommerce.common.primitives.Money;
import com.ekart.ecommerce.sales.catalog.FindProducts;
import com.ekart.ecommerce.sales.catalog.product.Description;
import com.ekart.ecommerce.sales.catalog.product.Product;
import com.ekart.ecommerce.sales.catalog.product.ProductId;
import com.ekart.ecommerce.sales.catalog.product.Title;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.assertThat;

@JdbcTest
@ContextConfiguration(classes = CatalogJdbcConfig.class)
class PutProductForSaleTest {

    @Autowired
    private FindProducts findProducts;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void product_put_for_sale_is_found() {
        Product product = new ProductJdbc(
                new ProductId("TEST"),
                new Title("test"),
                new Description("test"),
                new Money(1.f),
                jdbcTemplate
        );
        product.putForSale();

        Product found = findProducts.byId(new ProductId("TEST"));

        assertThat(found.id()).isEqualTo(new ProductId("TEST"));
    }
}
