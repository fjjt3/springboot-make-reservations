package org.app.springboot_reservations.reservation.repository;

import org.app.springboot_reservations.reservation.entity.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface IReservationDao extends CrudRepository<Reservation, Long> {
}
