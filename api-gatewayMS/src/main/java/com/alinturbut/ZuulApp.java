package com.alinturbut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * Created by Alin Turbut on 5/14/2017.
 */
@SpringBootApplication
@EnableZuulServer
@EnableZuulProxy
public class ZuulApp {
  public static void main(String[] args) {
    SpringApplication.run(ZuulApp.class, args);
  }
}
