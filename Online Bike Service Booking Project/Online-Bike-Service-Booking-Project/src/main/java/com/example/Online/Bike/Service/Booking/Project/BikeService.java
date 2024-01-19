package com.example.Online.Bike.Service.Booking.Project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BikeService {
    @Autowired
    private BikeRepository bikeRepository;

    public List<Bike> getAllBikes() {
        return bikeRepository.findAll();
    }
    public Bike createBike(Bike bike) {
        return bikeRepository.save(bike);
    }
}

