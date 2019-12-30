package guru.springframework.didemo.services;

public class PrimarySpanishGreetingServices implements GreetingService {

    //    public static final String HELLO_SPANISH = "Servicio de Saludo Primario";
    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingServices(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
