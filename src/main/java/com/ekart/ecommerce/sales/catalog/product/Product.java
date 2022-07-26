package com.ekart.ecommerce.sales.catalog.product;

import com.ekart.ecommerce.common.primitives.Money;
import com.ekart.ecommerce.sales.catalog.category.CategoryId;

/**
 * Product entity.
 */
public interface Product {

    ProductId id();

    Title title();

    Description description();

    Money price();

    void changeTitle(Title title);

    void changeDescription(Description description);

    void changePrice(Money price);

    void putForSale();

    void categorize(CategoryId categoryId);
}
