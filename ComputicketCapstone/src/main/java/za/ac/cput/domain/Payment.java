package za.ac.cput.domain;

import java.time.LocalDateTime;

public class Payment {
    private short paymentID;
    private double amount;
    private LocalDateTime paymentDate;
    private String paymentMethod;

    private Payment(){

    }
    private Payment(short paymentID, double amount, LocalDateTime paymentDate, String paymentMethod){
        this.paymentID = paymentID;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;

    }
}
