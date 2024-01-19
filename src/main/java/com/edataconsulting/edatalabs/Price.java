package com.edataconsulting.edatalabs;

import java.util.List;

public class Price {

    public static double calculate(List<Item> itemList) {
        double total = 0.0;

        for (Item item: itemList) {
            total += calculateItemFinalPrice(item);
        }

        return total;
    }

    private static double calculateItemFinalPrice(Item item) {
        Double priceWithTaxes = calculatePriceWithTaxes(item);
        return item.discount != null ? priceWithTaxes - item.discount : priceWithTaxes;
    }

    private static Double calculatePriceWithTaxes(Item item) {
        return item.price + (item.tax/100 * item.price);
    }
}
