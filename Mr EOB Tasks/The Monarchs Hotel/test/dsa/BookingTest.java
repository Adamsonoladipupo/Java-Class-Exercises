package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookingTest {
    Booking booking;

    @BeforeEach
    public void setUp(){
        booking = new Booking();
    }

    @Test
    public void no_booking_test(){
        assertEquals(0, booking.bookingSize());
    }

    @Test
    public void make_one_bookings_test(){
        booking.makeBookings("Ola", "001", 2020, 20000);
        assertEquals(1, booking.bookingSize());

    }


}
