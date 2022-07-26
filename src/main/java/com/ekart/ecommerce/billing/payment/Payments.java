package com.ekart.ecommerce.billing.payment;

import java.util.stream.Stream;


public interface Payments {

    Payments range(int start, int limit);

    Payments range(int limit);

    Stream<Payment> stream();
}
