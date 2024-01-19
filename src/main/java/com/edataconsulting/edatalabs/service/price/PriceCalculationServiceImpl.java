package com.edataconsulting.edatalabs.service.price;
import com.edataconsulting.edatalabs.model.CartItem;

import java.util.Collection;

public class PriceCalculationServiceImpl implements PriceCalculationService {

    @Override
    public double calculate(Collection<CartItem> cartItems) {
        return cartItems.stream()
                .mapToDouble(CartItem::getFinalPrice)
                .sum();
    }
}
