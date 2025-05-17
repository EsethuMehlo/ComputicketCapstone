package za.ac.cput;

import za.ac.cput.domain.Booking;
import za.ac.cput.factory.BookingFactory;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        Booking b1 = BookingFactory.createBooking("1234", 1234,
                5667, date," Pending");

    }
}