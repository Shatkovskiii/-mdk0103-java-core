package fitness;

import java.time.LocalDate;

public class Membership {
    private LocalDate registrationDate;
    private LocalDate expiryDate;
    private Customer customer;

    public Membership(Customer customer, LocalDate registrationDate, LocalDate expiryDate) {
        this.customer = customer;
        this.registrationDate = registrationDate;
        this.expiryDate = expiryDate;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public Customer getCustomer() {
        return customer;
    }
}