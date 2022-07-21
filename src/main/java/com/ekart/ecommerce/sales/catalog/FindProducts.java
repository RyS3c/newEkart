package com.ekart.ecommerce.sales.catalog;

import com.ekart.ecommerce.sales.catalog.product.Product;
import com.ekart.ecommerce.sales.catalog.product.ProductId;
import com.ekart.ecommerce.sales.catalog.product.Products;

/**
 * Find Products use-case.
 */
public interface FindProducts {

    /**
     * Lists all products.
     *
     * @return all products
     */
    Products all();

    /**
     * Finds a product by ID.
     *
     * @param id the product ID
     * @return the found product
     */
    Product byId(ProductId id);
}
