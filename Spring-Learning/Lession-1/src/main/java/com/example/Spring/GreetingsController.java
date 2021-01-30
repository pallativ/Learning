package com.example.Spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class Greeting{

    private String name;
    private String coffee;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoffee() {
        return coffee;
    }

    public void setCoffee(String coffee) {
        this.coffee = coffee;
    }
}

@RestController
@RequestMapping("/greetings")
public class GreetingsController {
    @Value("${greeting-name: Pallati}")
    private String name;
    @Value("${greeting-coffee:No one drinking Coffee}")
    private String greetingCoffee;

    @GetMapping
    public String getName() {
        return name;
    }

    @GetMapping("/greetCoffee")
    public String getCoffee() {
        return greetingCoffee;
    }
}
