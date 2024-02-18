package com.example.reservationsystem.serviceImpl;

import com.example.reservationsystem.model.Reservation;
import com.example.reservationsystem.repository.ReservationRepository;
import com.example.reservationsystem.service.CancellationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CancellationServiceImpl implements CancellationService {
    private final ReservationRepository reservationRepository;

    @Autowired
    public CancellationServiceImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public Reservation getReservationDetails(String pnrNumber) {
        // Implement logic to get reservation details
        // Example:
        return reservationRepository.findByPnrNumber(pnrNumber);
    }

    @Override
    public boolean cancelByPnrNumber(String pnrNumber) {
        Reservation reservation = reservationRepository.findByPnrNumber(pnrNumber);
        if (reservation != null) {
            reservationRepository.delete(reservation);
            return true;
        }
        return false;
    }
}
