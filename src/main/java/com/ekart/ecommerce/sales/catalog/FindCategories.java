package com.ekart.ecommerce.sales.catalog;

import com.ekart.ecommerce.sales.catalog.category.Categories;
import com.ekart.ecommerce.sales.catalog.category.Category;
import com.ekart.ecommerce.sales.catalog.category.CategoryId;

/**
 * Find Categories use-case.
 */
public interface FindCategories {

    /**
     * Lists all categories.
     *
     * @return all categories
     */
    Categories all();

    /**
     * Finds a category by the category ID.
     *
     * @param id the category ID
     * @return the category
     */
    Category byId(CategoryId id);
}
