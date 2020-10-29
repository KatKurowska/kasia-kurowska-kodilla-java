package com.kodilla.good.patterns.challenges.Food2Door;

public enum SupplierName {

    EXTRAFOODSHOP("ExtraFoodShop"),
    HEALTHYSHOP("HealthyShop"),
    GLUTENFREESHOP("GlutenFreeShop");

    private String producerName;

    SupplierName(String producerName) {
        this.producerName = producerName;
    }

    public String getProducerName() {
        return producerName;
    }

    public static FoodSupplier getFoodSupplier(String producerName) {
        if (producerName.equals(EXTRAFOODSHOP.getProducerName())) {
            return new ExtraFoodShop();
        } else if (producerName.equals(HEALTHYSHOP.getProducerName())) {
            return new HealthyShop();
        } else if (producerName.equals(GLUTENFREESHOP.getProducerName())) {
            return new GlutenFreeShop();
        } else {
            throw new RuntimeException("Supplier not found");
        }
    }
}
