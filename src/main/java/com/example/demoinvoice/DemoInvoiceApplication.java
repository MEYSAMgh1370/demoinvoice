package com.example.demoinvoice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:vendor.properties")
public class DemoInvoiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoInvoiceApplication.class, args);
    }

}
