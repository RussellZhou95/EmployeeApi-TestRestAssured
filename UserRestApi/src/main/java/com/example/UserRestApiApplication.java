package com.example;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.model.User;
import com.example.repo.UserRepository;

@SpringBootApplication
public class UserRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRestApiApplication.class, args);
	}

	
//	@Bean
//    CommandLineRunner init(UserRepository userRepo) {
//        return args -> {
//            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
//                User user = new User(name, name.toLowerCase() + "@domain.com");
//                userRepo.save(user);
//            });
//            userRepo.findAll().forEach(System.out::println);
//        };
//    }
}
