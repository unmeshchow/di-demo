package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController controller;

    @Before
    public void setUp() throws Exception {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void sayHello() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, controller.sayHello());
    }
}