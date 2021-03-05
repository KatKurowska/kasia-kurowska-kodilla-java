package com.kodilla.exception.test;

public class FlightChallenge {

    public static void main(String[] args) {
        Flight toHomeFlight = new Flight("Atlanta", "Oborniki Gorne");
        Flight orientalFlight = new Flight("Szanghaj", "Dubaj");
        Flight invadeEngland = new Flight("Paryz", "Londyn Heathrow");
        Flight weirdFlight = new Flight("Opole", "Rzeszow");
        SearchFlight searchFlight = new SearchFlight();
        System.out.println(searchFlight.findFlight(toHomeFlight));
        System.out.println(searchFlight.findFlight(orientalFlight));
        System.out.println(searchFlight.findFlight(invadeEngland));
        System.out.println(searchFlight.findFlight(weirdFlight));

    }
}
