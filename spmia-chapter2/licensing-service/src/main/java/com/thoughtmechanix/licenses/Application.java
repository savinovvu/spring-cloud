package com.thoughtmechanix.licenses;

import com.thoughtmechanix.licenses.clients.OrganizationFeignClient;
import com.thoughtmechanix.licenses.model.Organization;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class Application {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public OrganizationFeignClient organizationFeignClient(){
        return new OrganizationFeignClient() {
            @Override
            public Organization getOrganization(String organizationId) {
                return null;
            }
        };
    }



    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
}
