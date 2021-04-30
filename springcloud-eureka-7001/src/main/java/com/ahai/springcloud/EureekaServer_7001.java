package com.ahai.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EureekaServer_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EureekaServer_7001.class,args);
    }

}
