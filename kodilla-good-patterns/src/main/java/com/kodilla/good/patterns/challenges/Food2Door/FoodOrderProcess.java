package com.kodilla.good.patterns.challenges.Food2Door;

public class FoodOrderProcess {

    void processOrder(OrderData orderData) {
        try {
            FoodSupplier supplier = SupplierName.getFoodSupplier(orderData.getProducerName());
            if (supplier.process(orderData)!=false){
                System.out.println(orderData.getProducerName() + ": SUCCESS - order is processed.");
            } else {System.out.println(orderData.getProducerName() + ": FAIL - order is not processed.");}

        } catch (RuntimeException e) {
            System.out.println(orderData.getProducerName() + ": FAIL - order is not processed.");
        }
    }

}

