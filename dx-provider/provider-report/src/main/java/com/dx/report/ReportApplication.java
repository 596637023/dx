package com.dx.report;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients({"com.dx.system.api"})
public class ReportApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReportApplication.class, args);
    }

}
