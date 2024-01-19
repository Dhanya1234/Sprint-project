package com.example.Online.Bike.Service.Booking.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.Online.Bike.Service.Booking.Project")
public class OnlineBikeServiceBookingProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineBikeServiceBookingProjectApplication.class, args);
		System.out.println("Application Success.....");
	}

}
