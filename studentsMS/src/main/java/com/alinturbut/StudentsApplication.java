package com.alinturbut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StudentsApplication {

  public static void main(String[] args) {
    SpringApplication.run(StudentsApplication.class, args);
  }
}
