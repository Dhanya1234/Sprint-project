package com.example.Online.Bike.Service.Booking.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable String username) throws NotFoundException {
        User user = userService.findByUsername(username);
        return ResponseEntity.ok(user);
        
        }

    @PostMapping("/{username}")
    public ResponseEntity<String> createUser(@PathVariable String username) {
        return ResponseEntity.ok("User created successfully");
    }
   
}

