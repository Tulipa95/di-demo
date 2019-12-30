package guru.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServices implements GreetingService {
    public static final String HELLO_CONSTRUCTOR = "Hello - I was injected via the constructor!";

    @Override
    public String sayGreeting() {
        return HELLO_CONSTRUCTOR;
    }
}
