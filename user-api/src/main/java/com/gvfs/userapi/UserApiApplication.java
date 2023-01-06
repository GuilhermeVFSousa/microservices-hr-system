package com.gvfs.userapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gvfs.userapi.domain.User;
import com.gvfs.userapi.repositories.UserRepository;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.saveAll(List.of(
				new User(null, "Guilherme Sousa", "guilherme@mail.com", "123", 20.0),
				new User(null, "Matheus Sousa", "matheus@mail.com", "123", 20.0)
				));
	}

}
