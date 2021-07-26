package medvedev.guru.springframework.sfgdi.services;



/**
 * @author Denis Medvedev
 */

public class I18NSpanishService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
