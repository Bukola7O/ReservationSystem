package com.example.reservationsystem.service;

import com.example.reservationsystem.model.Reservation;

public interface CancellationService {
    Reservation getReservationDetails(String pnrNumber);

    boolean cancelByPnrNumber(String pnrNumber);
}
