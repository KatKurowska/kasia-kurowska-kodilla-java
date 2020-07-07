package com.kodilla.stream.world;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent europe = new Continent();
        Continent southAmerica = new Continent();
        Continent asia = new Continent();

        List<Continent> listOfContinent = new ArrayList<>();
        listOfContinent.add(europe);
        listOfContinent.add(southAmerica);
        listOfContinent.add(asia);
        world.setContinents(listOfContinent);

        Country chile = new Country("Chile", new BigDecimal("17574003"));
        Country argentine = new Country("Argentine", new BigDecimal("44938712"));
        Country panama = new Country("Panama", new BigDecimal("4176869"));

        List<Country> americanCountries = new ArrayList();
        americanCountries.add(chile);
        americanCountries.add(argentine);
        americanCountries.add(panama);
        southAmerica.setCountries(americanCountries);

        Country poland = new Country("Poland", new BigDecimal("38386000"));
        Country germany = new Country("Germany", new BigDecimal("83166711"));
        Country portugal = new Country("Portugal", new BigDecimal("10295909"));

        List<Country> europeanCountries = new ArrayList();
        europeanCountries.add(poland);
        europeanCountries.add(germany);
        europeanCountries.add(portugal);
        europe.setCountries(europeanCountries);

        Country china = new Country("China", new BigDecimal("1400050000"));
        Country russia = new Country("Russia", new BigDecimal("146748590"));
        Country indonesia = new Country("Indonesia", new BigDecimal("267670543"));

        List<Country> asianCountries = new ArrayList();
        asianCountries.add(china);
        asianCountries.add(russia);
        asianCountries.add(indonesia);
        asia.setCountries(asianCountries);

        //When
        System.out.println("People from all of this countries: " + world.getPeopleQuantity());

        //Then
        BigDecimal expectedPopulation = new BigDecimal("2013007337");
        Assert.assertEquals(expectedPopulation, world.getPeopleQuantity());
    }
}
