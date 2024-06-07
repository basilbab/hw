package com.helloworld2.hw.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class HelloWorld {

    @RequestMapping(value = "/hello")
   
    public String sayHello()
    {
        return "Hello This is Basil Baby";
    }
}
