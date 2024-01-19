package com.example.Online.Bike.Service.Booking.Project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceBookingService {
    @Autowired
    private ServiceBookingRepository serviceBookingRepository;

    public List<ServiceBooking> getAllServiceBookings() {
        return serviceBookingRepository.findAll();
    }

	public ServiceBooking createServiceBooking(ServiceBooking serviceBooking) {
		return null;
	}
}
