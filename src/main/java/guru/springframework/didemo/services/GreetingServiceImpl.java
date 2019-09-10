package guru.springframework.didemo.services;

/**
 * Created by uc on 9/10/2019
 */
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
