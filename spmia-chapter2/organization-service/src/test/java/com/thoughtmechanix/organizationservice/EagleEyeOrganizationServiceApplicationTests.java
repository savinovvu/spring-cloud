package com.thoughtmechanix.organizationservice;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RunWith(SpringRunner.class)
@SpringBootTest
@RestController("organization")
public class EagleEyeOrganizationServiceApplicationTests {

    @Test
    public void contextLoads() {
    }

    @GetMapping()
    public String getAll(){
        return "this is all organizations";
    }

}
