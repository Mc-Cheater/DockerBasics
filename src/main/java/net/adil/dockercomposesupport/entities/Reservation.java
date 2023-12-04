package net.adil.dockercomposesupport.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Reservation {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    private Double        price;
    @Enumerated(EnumType.STRING)
    private ReservationStatus status;
}
