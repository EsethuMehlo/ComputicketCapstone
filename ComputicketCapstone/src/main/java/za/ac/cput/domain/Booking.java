package za.ac.cput.domain;

import java.time.LocalDateTime;

public class Booking extends Customer{
    private String bookingID;
    private int customerID;
    private int ticketID;
    private LocalDateTime bookingDate  ;
    private String status;

    public Booking() {
    }

    private Booking(Builder build) {
        this.bookingID = build.bookingID;
        this.customerID = build.customerID;;
        this.ticketID = build.customerID;
        this.bookingDate = build.bookingDate;
        this.status = build.status;
    }

    public String getBookingID() {
        return bookingID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getTicketID() {
        return ticketID;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID=" + bookingID +
                ", customerID=" + customerID +
                ", ticketID=" + ticketID +
                ", bookingDate=" + bookingDate +
                ", status='" + status + '\'' +
                '}';
    }

    public static class Builder{
        private String bookingID;
        private int customerID;
        private int ticketID;
        private LocalDateTime bookingDate  ;
        private String status;

        public Builder(String bookingID, int customerID, int ticketID, LocalDateTime bookingDate, String status) {
            this.bookingID = bookingID;
            this.customerID = customerID;
            this.ticketID = ticketID;
            this.bookingDate = bookingDate;
            this.status = status;
        }

        public Builder() {
            
        }

        public Builder setBookingID(String bookingID) {
            this.bookingID = bookingID;
            return this;
        }

        public Builder setCustomerID(int customerID) {
            this.customerID = customerID;
            return this;
        }

        public Builder setTicketID(int ticketID) {
            this.ticketID = ticketID;
            return this;
        }

        public Builder setBookingDate(LocalDateTime bookingDate) {
            this.bookingDate = bookingDate;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder copy(Booking booking) {
            this.bookingID = bookingID;
            this.customerID = customerID;
            this.ticketID = ticketID;
            this.bookingDate = bookingDate;
            this.status = status;
            return this;
        }

        public Booking build() {
        }
    }
}
