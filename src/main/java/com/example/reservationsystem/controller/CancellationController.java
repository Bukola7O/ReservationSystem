package com.example.reservationsystem.controller;

import com.example.reservationsystem.model.Cancellation;
import com.example.reservationsystem.service.CancellationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CancellationController {
        private CancellationService cancellationService;

        @PostMapping("/cancellation")
        public boolean cancelReservation(@RequestBody Cancellation cancellation) {
            return cancellationService.cancelByPnrNumber(cancellation.getPnrNumber());
        }
}
