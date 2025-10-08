package org.example.student.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class StudentController {

    @GetMapping("/get")
    public String getStudent() {
        String s="hi+109+";
        return "Hello Student+bhargav+main";
    }
}
