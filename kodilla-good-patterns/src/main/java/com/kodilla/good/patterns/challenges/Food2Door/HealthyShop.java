package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements ProcessingTemplate {
    private OrderData orderData;
    private String producerName = "ExtraFoodShop";

    @Override
    public boolean process() {
        if (this.producerName.equals(orderData.getProductName())) {
            if (orderData.getQuantity() > 150) {
                return false;
            } else if (!orderData.getProductName().equals("chips")) {
                return false;
            } else {
                return true;
            }

        }
        return false;
    }

    public HealthyShop(OrderData orderData) {
        this.orderData = orderData;
    }
}
