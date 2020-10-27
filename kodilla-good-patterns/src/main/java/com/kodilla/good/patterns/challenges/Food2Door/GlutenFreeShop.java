package com.kodilla.good.patterns.challenges.Food2Door;

class GlutenFreeShop extends AbstractSupplier {

    @Override
    public boolean process(OrderData orderData) {
        if (orderData.getQuantity() > 50) {
            return false;
        } else if (!orderData.getProductName().equals("croissant")) {
            return false;
        } else {
            return true;
        }

    }

    public GlutenFreeShop() {
//        super();
        setSupplierName("GlutenFreeShop");
    }
}
