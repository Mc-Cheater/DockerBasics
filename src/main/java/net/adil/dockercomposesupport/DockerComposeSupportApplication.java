package net.adil.dockercomposesupport;

import net.adil.dockercomposesupport.entities.Reservation;
import net.adil.dockercomposesupport.entities.ReservationStatus;
import net.adil.dockercomposesupport.repositories.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DockerComposeSupportApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerComposeSupportApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner (ReservationRepository reservationRepository){
		return args->{
		reservationRepository.save(new Reservation(null,"reservation1",100d, ReservationStatus.CREATED));

			reservationRepository.save(new Reservation(null,"reservation2",100d, ReservationStatus.CONFIRMED));
			reservationRepository.save(new Reservation(null,"reservation3",100d, ReservationStatus.CANCELLED));

		};
	}
}
