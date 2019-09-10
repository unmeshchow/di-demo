package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by uc on 9/10/2019
 */
@Controller
public class MyController {

    @Autowired
    private GreetingService greetingService;

    public String hello() {
        System.out.println("Hello!!!!");
        return greetingService.sayGreeting();
    }
}
