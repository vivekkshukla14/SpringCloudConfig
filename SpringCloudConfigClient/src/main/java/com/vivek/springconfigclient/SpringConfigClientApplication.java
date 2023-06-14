package com.vivek.springconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfigClientApplication.class, args);
    }

}

@RefreshScope
@RestController
class MessageRestController {

    @Value("${msg:Ishu}")
    private String msg;

    @GetMapping("/hello")
    public String getMsg() {
        return "Hi, I am " + msg;
    }
}