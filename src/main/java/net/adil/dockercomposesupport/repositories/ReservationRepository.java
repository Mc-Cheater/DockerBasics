package net.adil.dockercomposesupport.repositories;

import net.adil.dockercomposesupport.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
