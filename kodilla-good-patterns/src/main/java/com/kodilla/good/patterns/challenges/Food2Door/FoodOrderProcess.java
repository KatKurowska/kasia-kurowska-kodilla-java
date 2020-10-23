package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FoodOrderProcess {
    List<ProcessingTemplate> producers = new ArrayList<>();

    void processOrder(OrderData orderData) {
        initializeProducers(orderData);
        Optional<ProcessingTemplate> orderProcessing = producers.stream().filter(ProcessingTemplate::process).findFirst();
        if (orderProcessing.isPresent()) {
            System.out.println(orderData.getProducerName() + ": SUCCESS - order is processed.");
        } else {
            System.out.println(orderData.getProducerName() + ": FAIL - order is not processed.");
        }
    }

    private void initializeProducers(OrderData orderData){
            producers = Arrays.asList(new ExtraFoodShop(orderData), new HealthyShop(orderData), new GlutenFreeShop(orderData));
    }
}
