package org.example.student.client;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("car")
public class car implements Vehicle {
    @Override
    public String drive() {
        return "car is driving";
    }
}
