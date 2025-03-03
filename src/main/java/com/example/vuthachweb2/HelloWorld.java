package com.example.vuthachweb2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


    @SpringBootApplication
@RestController
// @RequestMapping("/api/products")
public class HelloWorld {
	@RequestMapping("/")
	String home() {
		System.out.println("Hello");
		return "Hello World!";
    }

    @PostMapping("/post")
    public String postMethodName(@RequestBody String requestBody) {
        //TODO: process POST request
        
        return "Hello" + requestBody;
    }
    
}
