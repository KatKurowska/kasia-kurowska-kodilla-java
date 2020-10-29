package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements FoodSupplier {

    @Override
    public boolean process(OrderData orderData) {
        if (orderData.getQuantity() > 1000) {
            System.out.println("processing...");
            return false;
        } else if (orderData.getProductName().equals("apples")) {
            System.out.println("processing...");
            return false;
        } else {
            System.out.println("processing...");
            return true;
        }
    }
}