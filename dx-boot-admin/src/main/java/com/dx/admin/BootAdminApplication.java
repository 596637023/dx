package com.dx.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dx
 * @version 1.0
 * @date 2020/6/28 0028 14:10
 */
@SpringBootApplication
@EnableAdminServer
public class BootAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootAdminApplication.class, args);
    }
}
