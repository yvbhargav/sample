package org.example.student.configuration;
import org.example.student.client.Vehicle;
import org.example.student.client.car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {



    @Bean
    public Vehicle vehicldriver() {
        return new car();
    }
}
