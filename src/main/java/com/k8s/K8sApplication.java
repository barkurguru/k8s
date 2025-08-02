package com.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@SpringBootApplication
@RestController("/user")
public class K8sApplication {


	@RequestMapping("/")
	public String home() {
		return UUID.randomUUID().toString();
	}
	public static void main(String[] args) {
		SpringApplication.run(K8sApplication.class, args);
	}

}
