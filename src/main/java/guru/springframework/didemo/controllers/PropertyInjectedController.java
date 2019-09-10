package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by uc on 9/10/2019
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingServiceImpl; // property name as a bean name

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }
}
