package com.in28minutes.spring.basics.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl();
		int result = binarySearch.binarySearch(new int[]{12, 4}, 4);

		System.out.println("result = " + result );

		SpringApplication.run(DemoApplication.class, args);
	}

}
