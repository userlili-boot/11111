package org.free.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryStarter {

    public static void main(String[] args) {
        System.out.println("----------------spring boot start-------------------");
        SpringApplication.run(DiscoveryStarter.class, args);
        System.out.println("----------------spring boot end-------------------");
    }

}
