package com.example.democf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
public class DemoCfApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCfApplication.class, args);
	}

	@RequestMapping("/")

	public String getGreeting() throws UnknownHostException {


		return  (InetAddress.getLocalHost().getHostAddress());
	}

	@RequestMapping("/home")
	public String Greeting() {
		return  ("A3 SRE Team");
	}


}
