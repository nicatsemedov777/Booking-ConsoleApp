package controller;

public class FlightController {
  private final FlightServiceImpl flightService;

    public FlightController(FlightServiceImpl flightService) {
        this.flightService = flightService;
    }

    public List<Flight> getAllMyFlights(String name, String surName) {
        return flightService.getALlMyFlights(name, surName);

    }

    public List<Flight> searchTicket(String destination, int seats) {
        return flightService.searchTicket(destination,seats);
    }
    public List<Flight> getAllFlightsFromOneOfCity(String departureCity) {
        return flightService.getALlFlightsFromOneOfCity(departureCity);
    }

    public Flight getFlightsByFlightNumber(String flightNumber) {
        return flightService.getFlightsByFlightNumber(flightNumber);
    }
}
