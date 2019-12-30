package guru.springframework.didemo.services;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "en":
                return new PrimaryGreetingServices(greetingRepository);
            case "de":
                return new PrimaryGermanGreetingServices(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingServices(greetingRepository);
            default:
                return new PrimaryGreetingServices(greetingRepository);
        }
    }
}
