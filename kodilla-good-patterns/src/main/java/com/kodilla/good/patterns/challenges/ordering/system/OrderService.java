package com.kodilla.good.patterns.challenges.ordering.system;

import java.time.LocalDate;

public interface OrderService {
    boolean order(Product product, User user, LocalDate dateOfOrder);
}
