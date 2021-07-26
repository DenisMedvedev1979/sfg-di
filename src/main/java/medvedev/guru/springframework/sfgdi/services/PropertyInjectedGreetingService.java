package medvedev.guru.springframework.sfgdi.services;



/**
 * @author Denis Medvedev
 */
public class PropertyInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
