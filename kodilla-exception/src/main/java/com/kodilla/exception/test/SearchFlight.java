package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlight {

    Map<String, Boolean> airportMap = initializeAirportMap();

    public String findFlight(Flight flight) {
        String arrivalAirport = flight.getArrivalAirport();
        String departureAirport = flight.getDepartureAirport();
        Boolean arrivalAvailable = false;
        Boolean departureAvailable = false;
        try {
            arrivalAvailable = isAirportAvailable(arrivalAirport);
            departureAvailable = isAirportAvailable(departureAirport);
        } catch (RouteNotFoundException e) {
            System.out.println("Oh no! something went wrong! Error: " + e);
        }
        if (arrivalAvailable && departureAvailable) {
            return "Flight is ok!";
        } else {
            return "Flight is not available";
        }

    }

    private Boolean isAirportAvailable(String arrivalAirport) throws RouteNotFoundException {
        Boolean availability = airportMap.get(arrivalAirport);
        if (availability == null) {
            throw new RouteNotFoundException();
        }
        return availability;
    }

    private Map<String, Boolean> initializeAirportMap() {
        Map<String, Boolean> airportMap = new HashMap<>();
        airportMap.put("Atlanta", true);
        airportMap.put("Pekin", false);
        airportMap.put("Dubaj", true);
        airportMap.put("Los Angeles", true);
        airportMap.put("Tokio Haneda", false);
        airportMap.put("Chicago", true);
        airportMap.put("Paryz", true);
        airportMap.put("Szanghaj", true);
        airportMap.put("Hongkong", true);
        airportMap.put("Oborniki Gorne", false);
        airportMap.put("Londyn Heathrow", null);
        return airportMap;
    }
}
