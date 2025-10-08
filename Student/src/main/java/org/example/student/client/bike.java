package org.example.student.client;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("bike")
public class bike implements

Vehicle {
    @Override
    public String drive() {
        return "bike is driving";
    }
}
