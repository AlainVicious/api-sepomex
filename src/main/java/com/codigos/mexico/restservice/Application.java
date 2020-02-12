package com.codigos.mexico.restservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.codigos.mexico.restservice.entity.User;
import com.codigos.mexico.restservice.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	protected CommandLineRunner init(final UserRepository userRepository) {

		return args -> {
			User user = new User();
			user.setUsername("admin");
			user.setPassword("admin");
			user.setName("Administrador");
			user.setEmail("admin@mail.com");
			userRepository.save(user);

		};
	}
}
