package dao.impl;

public class FlightDaoImpl {
  @Override
    public List<Flight> getALlMyFlights(String name, String surName) {
        return null;
    }

    @Override
    public Flight getFlightsByFlightNumber(String flightNumber) {
        Flight flight;

        try (Connection connection = ConnectionSql.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "select * from flight where flightNumber=?");
            preparedStatement.setString(1, flightNumber);
            ResultSet resultSet = preparedStatement.executeQuery();
            flight = getFlight(resultSet);
            return flight;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Flight> getALlFlightsFromOneOfCity(String departureCity) {
        List<Flight> flights;

        try (Connection connection = ConnectionSql.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM flight WHERE departureCity = ? order by departureCity asc ");
            preparedStatement.setString(1, departureCity);
            ResultSet resultSet = preparedStatement.executeQuery();
            flights = getFlights(resultSet);
            return flights;
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    @Override
    public List<Flight> searchTicket(String destination,int seats) {
        List<Flight> flights;

        try (Connection connection = ConnectionSql.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM flight WHERE destination = ? and departureTime=? and  seats=?");
            preparedStatement.setString(1, destination);
            preparedStatement.setInt(2, seats);
            ResultSet resultSet = preparedStatement.executeQuery();
            flights = getFlights(resultSet);
            return flights;
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }


    private List<Flight> getFlights(ResultSet resultSet) throws SQLException {
        List<Flight> flights = new LinkedList<>();
        while (resultSet.next()) {
            Long id = resultSet.getLong("id");
            String flightNumber = resultSet.getString("flightNumber");
            String airline = resultSet.getString("airline");
            String destination = resultSet.getString("destination");
            String departureCity = resultSet.getString("departureCity");
            Timestamp arrivalTime = resultSet.getTimestamp("arrivalTime");
            Timestamp departureTime = resultSet.getTimestamp("departureTime");
            String gate = resultSet.getString("gate");
            String terminal = resultSet.getString("terminal");
            String status = resultSet.getString("status");
            String checkInCounter = resultSet.getString("checkInCounter");
            Timestamp boardingTime = resultSet.getTimestamp("boardingTime");
            int seats = resultSet.getInt("seats");
            int fullSeats = resultSet.getInt("fullSeats");

            Flight flight = new Flight(id, flightNumber, airline, destination,
                    departureCity, departureTime, arrivalTime, gate, terminal,
                    status, checkInCounter, boardingTime, seats, fullSeats);
            flights.add(flight);

        }
        return flights;
    }

    private Flight getFlight(ResultSet resultSet) throws SQLException {
        Flight flight = null;

        while (resultSet.next()) {
            Long id = resultSet.getLong("id");
            String flightNumber = resultSet.getString("flightNumber");
            String airline = resultSet.getString("airline");
            String destination = resultSet.getString("destination");
            String departureCity = resultSet.getString("departureCity");
            Timestamp arrivalTime = resultSet.getTimestamp("arrivalTime");
            Timestamp departureTime = resultSet.getTimestamp("departureTime");
            String gate = resultSet.getString("gate");
            String terminal = resultSet.getString("terminal");
            String status = resultSet.getString("status");
            String checkInCounter = resultSet.getString("checkInCounter");
            Timestamp boardingTime = resultSet.getTimestamp("boardingTime");
            int seats = resultSet.getInt("seats");
            int fullSeats = resultSet.getInt("fullSeats");

            flight = new Flight(id, flightNumber, airline, destination, departureCity,
                    departureTime, arrivalTime, gate, terminal, status,
                    checkInCounter, boardingTime, seats, fullSeats);


        }
        return flight;
    }
}
