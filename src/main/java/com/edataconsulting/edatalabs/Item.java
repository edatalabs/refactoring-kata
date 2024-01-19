package com.edataconsulting.edatalabs;

public class Item {
    double price;
    double tax;
    Double discount;

    public Item(double price, double tax, Double discount) {
        this.price = price;
        this.tax = tax;
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
