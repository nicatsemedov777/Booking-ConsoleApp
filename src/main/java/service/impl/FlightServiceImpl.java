package service.impl;

public class FlightServiceImpl {
    private final FlightDaoImpl flightDao;

    public FlightServiceImpl(FlightDaoImpl flightDao) {
        this.flightDao = flightDao;
    }

    @Override
    public List<Flight> getALlMyFlights(String name,String surName) {
        return flightDao.getALlMyFlights(name,surName);
    }

    @Override
    public Flight getFlightsByFlightNumber(String flightNumber) {
        return flightDao.getFlightsByFlightNumber(flightNumber);
    }

    @Override
    public List<Flight> getALlFlightsFromOneOfCity(String departureCity) {
        return flightDao.getALlFlightsFromOneOfCity(departureCity);
    }

    @Override
    public List<Flight> searchTicket(String destination, int seats) {
        return flightDao.searchTicket(destination,seats);
    }
}
