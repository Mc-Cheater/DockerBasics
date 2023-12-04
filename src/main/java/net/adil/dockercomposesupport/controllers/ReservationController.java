package net.adil.dockercomposesupport.controllers;

import lombok.AllArgsConstructor;
import net.adil.dockercomposesupport.entities.Reservation;
import net.adil.dockercomposesupport.repositories.ReservationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReservationController {
private ReservationRepository reservationRepository;

@GetMapping("/reservations")
public List<Reservation> reservations(){
   return  reservationRepository.findAll();
    }

}
