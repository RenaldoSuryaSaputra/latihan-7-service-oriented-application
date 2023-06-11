package com.gatewayservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteDefinitionRouteLocator;
import org.springframework.context.annotation.Bean;

import javax.swing.*;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayServiceApplication {

    public static final Logger LOGGER = LoggerFactory.getLogger(GatewayServiceApplication.class);

    public static void main(String[] args) {
//        SpringApplication.run(ConfigServiceApplication.class, args);
        new SpringApplicationBuilder(GatewayServiceApplication.class).run(args);
    }

}