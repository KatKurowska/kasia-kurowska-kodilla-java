package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements FoodSupplier {

    @Override
    public boolean process(OrderData orderData) {
        if (orderData.getQuantity() > 150) {
            System.out.println("processing...");
            return false;
        } else if (!orderData.getProductName().equals("chips")) {
            System.out.println("processing...");
            return false;
        } else {
            System.out.println("processing...");
            return true;
        }
    }
}