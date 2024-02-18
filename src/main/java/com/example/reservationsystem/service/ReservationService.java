package com.example.reservationsystem.service;

import com.example.reservationsystem.model.Reservation;

public interface ReservationService {
    Reservation makeReservation(Reservation reservation);
    Reservation getReservationById(Long id);
    Reservation cancelReservation(String pnrNumber);
}
