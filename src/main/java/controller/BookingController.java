package controller;

public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public void cancelBooking(String bookingNumber) {
         bookingService.cancelBooking(bookingNumber);
    }
}
