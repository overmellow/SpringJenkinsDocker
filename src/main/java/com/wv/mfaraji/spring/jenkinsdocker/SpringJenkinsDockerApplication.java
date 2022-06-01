package com.wv.mfaraji.spring.jenkinsdocker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJenkinsDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsDockerApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner sampleData(ThemeParkRideRepository repository) {
        return (args) -> {
            repository.save(new ThemeParkRide("Rollercoaster", "Train ride that speeds you along.", 5, 3));
            repository.save(new ThemeParkRide("Log flume", "Boat ride with plenty of splashes.", 3, 2));
            repository.save(new ThemeParkRide("Teacups", "Spinning ride in a giant tea-cup.", 2, 4));
            repository.save(new ThemeParkRide("Water Flame", "Flame Coming out of water.", 4, 5));
            System.out.println("hwat");
        };
    
	}
}
