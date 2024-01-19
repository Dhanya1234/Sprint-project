package com.example.Online.Bike.Service.Booking.Project;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/service-bookings")
public class ServiceBookingController {
    @Autowired
    private ServiceBookingService serviceBookingService;

    @SuppressWarnings("rawtypes")
	@GetMapping
    public ResponseEntity<List> getAllServiceBookings() {
        List serviceBookings = (List) serviceBookingService.getAllServiceBookings();
        return ResponseEntity.ok(serviceBookings);
    }
    @PostMapping
    public ResponseEntity<ServiceBooking> createServiceBooking(@RequestBody ServiceBooking serviceBooking) {
        ServiceBooking createdServiceBooking = serviceBookingService.createServiceBooking(serviceBooking);
        return ResponseEntity.ok(createdServiceBooking);
    }

}

