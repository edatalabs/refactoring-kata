package com.edataconsulting.edatalabs.service.price;

import com.edataconsulting.edatalabs.model.CartItem;

import java.util.Collection;

public interface PriceCalculationService {
    double calculate(Collection<CartItem> cartItems);
}
