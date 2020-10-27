package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop extends AbstractSupplier {

    @Override
    public boolean process(OrderData orderData) {
        if (orderData.getQuantity() > 150) {
            return false;
        } else if (!orderData.getProductName().equals("chips")) {
            return false;
        } else {
            return true;
        }

    }

    public HealthyShop() {
        setSupplierName("ExtraFoodShop");
    }
}
