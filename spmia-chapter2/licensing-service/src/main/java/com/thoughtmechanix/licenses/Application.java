package com.thoughtmechanix.licenses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
//@EnableEurekaClient
public class Application {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

/*    @Bean
    public OrganizationFeignClient organizationFeignClient(){
        ret
    }*/



    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
}
