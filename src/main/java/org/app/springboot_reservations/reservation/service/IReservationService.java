package org.app.springboot_reservations.reservation.service;


import org.app.springboot_reservations.reservation.entity.Reservation;

import java.util.List;

public interface IReservationService {

    public List<Reservation> findAll();
    public void save(Reservation reservation);
    public void update(Reservation reservation);
    public Reservation findOne(Long id);
    public void delete(Long id);
}
