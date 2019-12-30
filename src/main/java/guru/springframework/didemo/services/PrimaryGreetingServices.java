package guru.springframework.didemo.services;

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
