package com.kodilla.good.patterns.challenges.ordering.system;

import java.time.LocalDate;

public class OrderData {

    public Order create() {

        User user = new User("487012", "John", "Smith", "jsmith@gamil.com");
        Product product = new Product("The Witcher 3: Wild Hunt", 40.00, "CD PROJECT RED");
        Order order = new Order(user, product, LocalDate.of(2020, 10, 20));

        return order;
    }
}

