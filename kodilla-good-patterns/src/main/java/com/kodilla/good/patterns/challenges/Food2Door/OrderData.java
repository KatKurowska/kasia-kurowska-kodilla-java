package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderData {
    private String producerName;
    private int quantity;
    private String productName;

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public OrderData(String producerName, int quantity, String productName) {
        this.producerName = producerName;
        this.quantity = quantity;
        this.productName = productName;
    }
}
