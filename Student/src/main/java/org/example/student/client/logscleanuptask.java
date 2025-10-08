package org.example.student.client;

import org.springframework.stereotype.Component;

@Component
public class logscleanuptask implements Runnable {
    @Override
    public void run() {
        System.out.println("Log cleanup task is running...");
        // Add log cleanup logic here
        try{
            Thread.sleep(5000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
