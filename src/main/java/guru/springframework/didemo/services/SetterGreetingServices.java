package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServices implements GreetingService {
    public static final String HELLO_SETTER = "Hello - I was injected by the setter";

    @Override
    public String sayGreeting() {
        return HELLO_SETTER;
    }
}
