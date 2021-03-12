package com.kodilla.good.patterns.challenges.flightsearching;

public class Main {

    public static void main(String[] args) {

        Flight flight1 = new Flight("Katowice", "Berlin");
        Flight flight2 = new Flight("Beijing ", "Paris");
        Flight flight3 = new Flight("Atlanta", "Moscow");
        Flight flight4 = new Flight("Moscow", "Atlanta");
        Flight flight5 = new Flight("Beijing", "Katowice");
        Flight flight6 = new Flight("Beijing", "London");
        Flight flight7 = new Flight("Berlin", "Prague");
        Flight flight8 = new Flight("Atlanta", "Katowice");
        Flight flight9 = new Flight("Paris", "Atlanta");
        Flight flight10 = new Flight("Rome", "Paris");

        FlightSearcher flightSearcher = new FlightSearcher();
        System.out.println(flightSearcher.allFlightsFrom("Poznan"));
        System.out.println(flightSearcher.allFlightsFrom("Atlanta"));
        System.out.println(flightSearcher.allFlightsTo("London"));
        System.out.println(flightSearcher.allFlightsTo("Wroclaw"));
        System.out.println(flightSearcher.getIndirectFlights("Atlanta", "Katowice", "Berlin"));
        System.out.println(flightSearcher.getIndirectFlights("Paris", "Rome", "Moscow"));
    }
}
