package com.example.Online.Bike.Service.Booking.Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceBookingRepository extends JpaRepository<ServiceBooking, Long> {

}

