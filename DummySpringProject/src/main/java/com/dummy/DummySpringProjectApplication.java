package com.dummy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dummy.repositories.UserRepository;

@SpringBootApplication
public class DummySpringProjectApplication {


	public static void main(String[] args) {
		SpringApplication.run(DummySpringProjectApplication.class, args);
	}

}
