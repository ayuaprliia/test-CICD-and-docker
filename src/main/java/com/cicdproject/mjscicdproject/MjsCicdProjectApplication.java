package com.cicdproject.mjscicdproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MjsCicdProjectApplication {
	@GetMapping("/welcome")
	public String get(){
		return "Manajemen Server Kelas C yang dibuat oleh komang Ayu Agung Arya Aprilia (2205551030) dan Made Yurista Indani Sukma (2205551078)";
	}

	public static void main(String[] args) {
		SpringApplication.run(MjsCicdProjectApplication.class, args);
	}

}
