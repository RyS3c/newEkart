package com.ekart.ecommerce.billing.payment;

import com.ekart.ecommerce.common.primitives.Money;


public interface CollectPayment {

    /**
     * Collects a payment.
     *
     * @param referenceId the reference ID for the payment
     * @param total       the total amount of money to be collected
     */
    void collect(ReferenceId referenceId, Money total);
}
