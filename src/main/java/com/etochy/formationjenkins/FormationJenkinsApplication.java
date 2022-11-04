package com.etochy.formationjenkins;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FormationJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(FormationJenkinsApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", 8083));
		app.run(args);
	}
}
