package com.example.reservationsystem.repository;

import com.example.reservationsystem.model.Cancellation;
import org.springframework.stereotype.Repository;

@Repository
public interface CancellationRepository {
    Cancellation findByPnrNumber(String pnrNumber);
}
