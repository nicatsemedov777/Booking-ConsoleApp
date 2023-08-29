package constants;

public enum Commands {
    SHOW_TICKET("Online-board"),
    FLIGHT_INFO("Show the flight info"),
    BOOKING("Search and book a flight"),
    CANCEL("Cancel the booking"),
    MY_FLIGHTS("My flights"),
    EXIT("Exit");
    private final String value;

    Commands(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
