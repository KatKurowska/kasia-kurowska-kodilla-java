package com.kodilla.good.patterns.challenges.ordering.system;

import java.time.LocalDate;

public class OrderRepositorySaver implements OrderRepository {


    @Override
    public void saveOrder(User user, LocalDate dateOfOrder) {
        System.out.println("The order of " + user.getNumber() + " from " + dateOfOrder.toString() + " was saved in repository.");

    }
}
