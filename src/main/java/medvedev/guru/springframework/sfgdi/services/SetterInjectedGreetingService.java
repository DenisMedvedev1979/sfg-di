package medvedev.guru.springframework.sfgdi.services;



/**
 * @author Denis Medvedev
 */

public class SetterInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
