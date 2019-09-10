package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;

/**
 * Created by uc on 9/10/2019
 */
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
