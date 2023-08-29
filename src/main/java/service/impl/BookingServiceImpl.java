package service.impl;

public class BookingServiceImpl {
    private final BookingDao bookingDao;

    public BookingServiceImpl(BookingDao bookingDao) {
        this.bookingDao = bookingDao;
    }


    @Override
    public void cancelBooking(String bookingNumber) {
        bookingDao.cancelBooking(bookingNumber);
    }
}
