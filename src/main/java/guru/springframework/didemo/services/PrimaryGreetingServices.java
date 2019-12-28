package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingServices implements GreetingService {
    public static final String HELLO_PRIMARY = "Hello - Primary Greeting service";

    @Override
    public String sayGreeting() {
        return HELLO_PRIMARY;
    }
}
