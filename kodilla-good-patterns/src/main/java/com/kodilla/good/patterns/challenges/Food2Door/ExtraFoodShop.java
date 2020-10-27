package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop extends AbstractSupplier {

    @Override
    public boolean process(OrderData orderData) {
        if (orderData.getQuantity() > 1000) {
            return false;
        } else if (orderData.getProductName().equals("apples")) {
            return false;
        } else {
            return true;
        }

    }

    public ExtraFoodShop( ) {
        setSupplierName("ExtraFoodShop");
    }
}

