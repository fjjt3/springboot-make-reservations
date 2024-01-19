package org.app.springboot_reservations.customer.entity;

import jakarta.persistence.*;
import org.app.springboot_reservations.reservation.entity.Reservation;

import java.util.Set;


@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;

    @OneToMany(mappedBy = "customer")
    private Set<Reservation> Reservations;

    public Customer() {
    }

    public Customer(Long id, String name, String email, Set<Reservation> reservations) {
        this.id = id;
        this.name = name;
        this.email = email;
        Reservations = reservations;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Reservation> getReservations() {
        return Reservations;
    }

    public void setReservations(Set<Reservation> reservations) {
        Reservations = reservations;
    }

    // getters and setters
}