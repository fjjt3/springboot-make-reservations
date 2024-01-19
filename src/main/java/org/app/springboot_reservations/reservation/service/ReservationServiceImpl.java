package org.app.springboot_reservations.reservation.service;



import org.app.springboot_reservations.reservation.entity.Reservation;
import org.app.springboot_reservations.reservation.repository.IReservationDao;

import java.util.List;
import java.util.Optional;

public class ReservationServiceImpl implements IReservationService{

    private IReservationDao reservationDao;

    @Override
    public List<Reservation> findAll() {
        return (List<Reservation>) reservationDao.findAll();
    }

    @Override
    public void save(Reservation reservation) {
        reservationDao.save(reservation);

    }

    @Override
    public void update(Reservation reservation) {
        reservationDao.save(reservation);

    }

    @Override
    public Reservation findOne(Long id) {
        Optional<Reservation> reservationOptional = reservationDao.findById(id);
        return reservationOptional.orElse(null);
    }

    @Override
    public void delete(Long id) {
        reservationDao.deleteById(id);

    }
}
