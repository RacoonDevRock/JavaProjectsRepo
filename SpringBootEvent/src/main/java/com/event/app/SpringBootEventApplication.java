package com.event.app;

import com.event.app.publisher.UserPublisher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootEventApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEventApplication.class, args);
	}

	private final UserPublisher userPublisher;

	public SpringBootEventApplication(UserPublisher userPublisher) {
		this.userPublisher = userPublisher;
	}

	@Bean
	CommandLineRunner init() {
		return args -> {
			userPublisher.publishUserRegisteredEvent("Guillermo","8765",(byte)45);
			userPublisher.publishUserValidatedEvent("Monica",false);
		};
	}

}
