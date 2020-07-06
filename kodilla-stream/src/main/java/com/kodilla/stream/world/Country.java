package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private String nameOfCountry;
    private BigDecimal peopleQuantity;

    public Country(String nameOfCountry, BigDecimal peopleQuantity) {
        this.nameOfCountry = nameOfCountry;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
