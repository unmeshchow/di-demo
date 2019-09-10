package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController controller;

    @Before
    public void setUp() throws Exception {
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void sayHello() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, controller.sayHello());
    }
}