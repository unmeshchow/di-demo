package guru.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by uc on 9/10/2019
 */
@Controller
public class MyController {

    public String hello() {
        System.out.println("Hello!!!!");
        return "foo";
    }
}
