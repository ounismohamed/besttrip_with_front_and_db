package com.scrum.besttrip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class BesttripApplication {

	public static void main(String[] args) {

		SpringApplication.run(BesttripApplication.class, args);

	}

	@RequestMapping(value="/")
	public String homepage(){
		return "index";
	}
}
