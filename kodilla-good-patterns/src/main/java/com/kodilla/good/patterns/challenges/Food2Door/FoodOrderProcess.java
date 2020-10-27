package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FoodOrderProcess {
    List<AbstractSupplier> producers = new ArrayList<>();

    void processOrder(OrderData orderData) {
        initializeProducers();
        String supplierName = orderData.getProducerName();
        Optional<AbstractSupplier> orderProcessing =
                producers.stream()
                        .filter(x -> x.isThisSupplier(supplierName))
                        .findFirst();

        if (orderProcessing.isPresent() && processOrderDate(orderData, orderProcessing.get())) {
            System.out.println(orderData.getProducerName() + ": SUCCESS - order is processed.");
        } else {
            System.out.println(orderData.getProducerName() + ": FAIL - order is not processed.");
        }
    }

    private boolean processOrderDate(OrderData orderData, AbstractSupplier orderProcessing) {
        return orderProcessing.process(orderData);
    }

    private void initializeProducers() {
        producers = Arrays.asList(new ExtraFoodShop(), new HealthyShop(), new GlutenFreeShop());
    }
}
