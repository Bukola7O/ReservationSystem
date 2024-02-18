package com.example.reservationsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories("com.example.reservationsystem.repository")
public class ReservationSystemApplication {

    public static void main(String[] args) {

        SpringApplication.run(ReservationSystemApplication.class, args);
    }

}
