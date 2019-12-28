package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingServices implements GreetingService {
    public static final String HELLO_GERMAN = "Primarer GruBdienst";

    @Override
    public String sayGreeting() {
        return HELLO_GERMAN;
    }
}
