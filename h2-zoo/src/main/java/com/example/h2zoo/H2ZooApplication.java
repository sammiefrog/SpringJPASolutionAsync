package com.example.h2zoo;

import com.example.h2zoo.model.Amphibian;
import com.example.h2zoo.model.Reptile;
import com.example.h2zoo.repository.AmphibianRepository;
import com.example.h2zoo.repository.ReptileRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class H2ZooApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(H2ZooApplication.class, args);
		ReptileRepository reptileRepository =
				configurableApplicationContext.getBean(ReptileRepository.class);
		Reptile kingCobra = new Reptile("Slither", "Snake", "Black & Yellow", "Carnivore");
		Reptile komodoDragon = new Reptile("Dennis", "Lizard", "Brown", "Carnivore");
		reptileRepository.saveAll(List.of(kingCobra, komodoDragon));

		AmphibianRepository amphibianRepository = configurableApplicationContext.getBean(AmphibianRepository.class);
		Amphibian treeFrog = new Amphibian("Eddie", "Frog", "Lime Green", "Arboreal");
		Amphibian newt = new Amphibian("Ned", "Newt", "Black", "Semiaquatic");
		amphibianRepository.saveAll(List.of(treeFrog, newt));
	}

}
