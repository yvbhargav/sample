package org.example.student.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class StudentController {

    @GetMapping("/get")
    public String getStudent() {
    String s="uhk";
        return "Hello+109";
    }
}
