package com.kodilla.good.patterns.challenges.ordering.system;

import java.time.LocalDate;

public class GameOrderService implements OrderService {

    public boolean order(Product product, User user, LocalDate dateOfOrder) {
        System.out.println("The game " + product.getName() + " for " + product.getPrice() + "$" +
                " was ordered by: " + user.getName() + " " +
                user.getSurname() + " (" + dateOfOrder.toString() + ")");
        return true;
    }
}
