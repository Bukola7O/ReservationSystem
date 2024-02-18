package com.example.reservationsystem.serviceImpl;

import com.example.reservationsystem.model.Reservation;
import com.example.reservationsystem.repository.ReservationRepository;
import com.example.reservationsystem.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;
    @Override
    public Reservation makeReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation getReservationById(Long id) {
        return null;
    }
    @Override
    public Reservation cancelReservation(String pnrNumber) {
        Reservation reservation = reservationRepository.findByPnrNumber(pnrNumber);
        if (reservation != null) {
            reservationRepository.delete(reservation);
        }
        return reservation;
    }
}
