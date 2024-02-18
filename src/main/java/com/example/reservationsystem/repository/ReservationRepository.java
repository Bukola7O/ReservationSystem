package com.example.reservationsystem.repository;

import com.example.reservationsystem.model.Reservation;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    Reservation save(Reservation reservation);
    Reservation findByPnrNumber(String pnrNumber);
    void deleteById(Long id);

    void delete(Reservation reservation);
}
