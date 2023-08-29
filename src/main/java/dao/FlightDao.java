package dao;

public interface FlightDao  {
    List<Flight> getALlMyFlights(String name, String surName);

    Flight getFlightsByFlightNumber(String flightNumber);

    List<Flight> getALlFlightsFromOneOfCity(String departureCity);

    List<Flight> searchTicket(String destination,int seats);
}
