package com.ekart.ecommerce.warehouse.rest;

import com.ekart.ecommerce.warehouse.ProductId;
import com.ekart.ecommerce.warehouse.Warehouse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * REST controller for Warehouse use-cases.
 */
@RestController
@RequestMapping("/warehouse")
@RequiredArgsConstructor
class WarehouseController {

    private final @NonNull Warehouse warehouse;

    @GetMapping("/stock/{productId}")
    public Integer productsInStock(@PathVariable @NonNull String productId) {
        return warehouse.leftInStock(new ProductId(productId)).amount().value();
    }
}
