package com.kodilla.good.patterns.challenges.ordering.system;

import java.time.LocalDate;

public interface InformationService {

    public void confirm(User user, Product product, LocalDate dateOfOrder, boolean isOrdered);
}
