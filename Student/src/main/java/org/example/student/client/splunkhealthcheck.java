package org.example.student.client;

import org.springframework.stereotype.Component;

import java.util.concurrent.Callable;

@Component
public class splunkhealthcheck implements Callable<String> {
    public String call() throws Exception{
        System.out.println("checking health");
        {
            Thread.sleep(5000);
        }

        return "healthy";
    }
}
