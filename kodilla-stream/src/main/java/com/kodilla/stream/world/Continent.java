package com.kodilla.stream.world;

import java.util.List;

public class Continent {

    //collections of countries on this continent

    private List<Country> listOfCountries;

    public List<Country> getCountries() {
        return (listOfCountries);
    }

    public void setCountries(List<Country> countries) {
        this.listOfCountries = countries;
    }
}
