package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

public class World {

    //collection of continents

    private List<Continent> continents;

    public void setContinents(List<Continent> continents) {
        this.continents = continents;
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream()
                        .flatMap(country -> Stream.of(country.getPeopleQuantity())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

    }
}
