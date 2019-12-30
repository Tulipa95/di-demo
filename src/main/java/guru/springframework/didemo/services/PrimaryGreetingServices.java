package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en", "default"})
public class PrimaryGreetingServices implements GreetingService {
    //    public static final String HELLO_PRIMARY = "Hello - Primary Greeting service";
    private GreetingRepository greetingRepository;

    public PrimaryGreetingServices(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {

        return greetingRepository.getEnglishGreeting();
    }
}
