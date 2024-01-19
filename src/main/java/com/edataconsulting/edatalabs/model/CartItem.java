package com.edataconsulting.edatalabs.model;

public class CartItem {
        private double price;
        private double taxPercentage;
        private double discount;

        public CartItem(double price, double taxPercentage, double discount) {
            this.price = price;
            this.taxPercentage = taxPercentage;
            this.discount = discount;
        }

        public double getFinalPrice() {
            return this.getPrice() + (this.getPrice() * (this.getTaxPercentage()/100)) - this.getDiscount();
        }

        public double getPrice() {
            return price;
        }

        public double getTaxPercentage() {
            return taxPercentage;
        }

        public double getDiscount() {
            return discount;
        }
    }
