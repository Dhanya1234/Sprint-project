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
@RequestMapping("/api/bikes")
public class BikeController {
    @Autowired
    private BikeService bikeService;

    @SuppressWarnings("rawtypes")
	@GetMapping
    public ResponseEntity<List> getAllBikes() {
        List bikes = (List) bikeService.getAllBikes();
        return ResponseEntity.ok(bikes);
    }
    @PostMapping
    public ResponseEntity<Bike> createBike(@RequestBody Bike bike) {
        Bike createdBike = bikeService.createBike(bike);
        return ResponseEntity.ok(createdBike);
    }
}
