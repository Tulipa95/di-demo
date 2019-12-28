package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingServices implements GreetingService {

    public static final String HELLO_SPANISH = "Servicio de Saludo Primario";

    @Override
    public String sayGreeting() {
        return HELLO_SPANISH;
    }
}
