package com.kodilla.good.patterns.challenges.ordering.system;

import java.time.LocalDate;

public class Order {

    User user;
    Product product;
    LocalDate dateOfOrder;

    public Order(User user, Product product, LocalDate dateOfOrder) {
        this.user = user;
        this.product = product;
        this.dateOfOrder = dateOfOrder;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }
}
