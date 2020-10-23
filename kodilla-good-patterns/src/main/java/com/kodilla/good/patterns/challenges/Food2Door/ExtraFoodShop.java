package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements ProcessingTemplate {
    private OrderData orderData;
    private String producerName = "ExtraFoodShop";

    @Override
    public boolean process() {
        if (this.producerName.equals(orderData.getProducerName())) {
            if (orderData.getQuantity() > 1000) {
                return false;
            } else if (orderData.getProductName().equals("apples")) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public ExtraFoodShop(OrderData orderData) {
        this.orderData = orderData;
    }
}

