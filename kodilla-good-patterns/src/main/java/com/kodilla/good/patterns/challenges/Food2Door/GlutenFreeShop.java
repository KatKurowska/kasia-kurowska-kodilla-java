package com.kodilla.good.patterns.challenges.Food2Door;

class GlutenFreeShop implements FoodSupplier {

    @Override
    public boolean process(OrderData orderData) {
        if (orderData.getQuantity() > 50) {
            System.out.println("processing...");
            return false;
        } else if (!orderData.getProductName().equals("croissant")) {
            System.out.println("processing...");
            return false;
        } else {
            System.out.println("processing...");
            return true;
        }
    }
}
