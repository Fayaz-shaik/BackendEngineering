package com.Backend.week1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class Week1Application implements CommandLineRunner {

	@Autowired
	Apple objec;
	public static void main(String[] args) {
		SpringApplication.run(Week1Application.class, args);
		//setObjec();

	//destroy();
	}

	@Override
	public void run(String... args) throws Exception {
		objec.setApple();
	}
}
