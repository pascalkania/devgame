package de.kania.devgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class DevgameApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevgameApplication.class, args);
	}
}
