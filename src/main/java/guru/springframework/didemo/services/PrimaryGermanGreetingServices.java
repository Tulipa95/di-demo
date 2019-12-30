package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingServices implements GreetingService {
//    public static final String HELLO_GERMAN = "Primarer GruBdienst";

    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingServices(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {

        return greetingRepository.getGermanGreeting();
    }

}
