package com.kodilla.good.patterns.challenges.ordering.system;

import java.time.LocalDate;

public interface OrderRepository {
    public void saveOrder(User user, LocalDate dateOfOrder);
}
