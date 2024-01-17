package com.edataconsulting.edatalabs;

public class Price {

    public static double calculate(double priceI1, double taxi1, double disc1, double priceI2) {
        double total = 0.0f;

        double item1 = priceI1 + (taxi1/100 * priceI1);
        total = total + item1 - disc1;
        // After item 2, taxes = 25%
        total += priceI2 + (0.25 * priceI2);
        return total;
    }

}
