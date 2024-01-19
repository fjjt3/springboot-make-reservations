package org.app.springboot_reservations.reservation.entity;

import jakarta.persistence.*;
import org.app.springboot_reservations.customer.entity.Customer;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private int numberOfRooms;

    public Reservation() {
    }

    public Reservation(Long id, Customer customer, int numberOfRooms) {
        this.id = id;
        this.customer = customer;
        this.numberOfRooms = numberOfRooms;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}
