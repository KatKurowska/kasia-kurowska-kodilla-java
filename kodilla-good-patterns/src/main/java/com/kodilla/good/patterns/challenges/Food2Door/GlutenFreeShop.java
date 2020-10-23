package com.kodilla.good.patterns.challenges.Food2Door;

class GlutenFreeShop implements ProcessingTemplate {
    private OrderData orderData;
    private String producerName = "GlutenFreeShop";

    @Override
    public boolean process() {
        if (this.producerName.equals(orderData.getProductName())) {
            if (orderData.getQuantity() > 50) {
                return false;
            } else if (!orderData.getProductName().equals("croissant")) {
                return false;
            } else {
                return true;
            }

        }
        return false;
    }

    public GlutenFreeShop(OrderData orderData) {
        this.orderData = orderData;
    }
}
