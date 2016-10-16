package com.nodojo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.nodojo.dao.EventsRepository;
import com.nodojo.models.Events;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@ComponentScan({"com.nodojo.controllers","com.nodojo.dao","com.nodojo.models"})
public class Application {
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
	}
	@Bean
	public CommandLineRunner demo(EventsRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Events("Dojo Java basic 1", "Lundi 10 octobre", "12 quais des marques"));
			repository.save(new Events("Dojo Java basic 2", "Mardi 11 octobre", "12 quais des marques"));
			repository.save(new Events("Dojo Java basic 3", "Mercredi 12 octobre", "5 square des bosquets"));
			repository.save(new Events("Dojo JavaScript basic 1", "Lundi 10 octobre", "5 square des bosquets"));
			repository.save(new Events("Dojo JavaScript basic 2", "Mardi 11 octobre", "12 quais des marques"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Events event : repository.findAll()) {
				log.info(event.toString());
			}
            log.info("");

			// fetch an individual customer by ID
			Events event = repository.findOne(1L);
			log.info("Events found with findOne(1L):");
			log.info("--------------------------------");
			log.info(event.toString());
            log.info("");

			// fetch customers by last name
			log.info("Event found with findByName('Dojo JavaScript basic 2'):");
			log.info("--------------------------------------------");
			for (Events dojojs2 : repository.findByName("Dojo JavaScript basic 2")) {
				log.info(dojojs2.toString());
			}
            log.info("");
		};
	}


}
