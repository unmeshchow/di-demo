package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetterInjectedControllerTest {

    private SetterInjectedController controller;

    @Before
    public void setUp() throws Exception {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void sayHello() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, controller.sayHello());
    }
}