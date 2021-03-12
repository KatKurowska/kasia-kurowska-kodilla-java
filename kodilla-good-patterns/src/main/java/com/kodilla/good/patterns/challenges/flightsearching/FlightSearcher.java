package com.kodilla.good.patterns.challenges.flightsearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FlightSearcher {
    List<Flight> allFlightsFrom(String from) {
        return Flight.allFlights.stream()
                .filter(flight -> flight.getFrom().equals(from))
                .collect(Collectors.toList());
    }

    List<Flight> allFlightsTo(String to) {
        return Flight.allFlights.stream()
                .filter(flight -> flight.getTo().equals(to))
                .collect(Collectors.toList());
    }

    private Optional<Flight> findFlight(String from, String to) {
        return Flight.allFlights.stream()
                .filter(flight -> flight.getTo().equals(to) && flight.getFrom().equals(from))
                .findFirst();

    }

    List<Flight> getIndirectFlights(String from, String via, String to) throws RuntimeException {
        Optional<Flight> firstFlight = findFlight(from, via);
        Optional<Flight> secondFlight = findFlight(via, to);
        if (firstFlight.isPresent() && secondFlight.isPresent()) {
            return Arrays.asList(firstFlight.get(), secondFlight.get());

        } else {
            return new ArrayList<>();
        }
    }
}
