package guru.springframework.didemo.services;

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
