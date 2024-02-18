package com.example.reservationsystem.controller;

import com.example.reservationsystem.model.Reservation;
import com.example.reservationsystem.service.ReservationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationController {
    private ReservationService reservationService;

    @PostMapping("/reservation")
    public Reservation makeReservation(@RequestBody Reservation reservation) {
        return reservationService.makeReservation(reservation);
    }
}
