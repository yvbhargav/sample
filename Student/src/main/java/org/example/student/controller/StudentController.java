package org.example.student.controller;

import org.example.student.client.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


    @Autowired
    private Vehicle vehicle;

    @GetMapping("/get")
    public String getStudent() {

        return vehicle.drive();
    }
}
