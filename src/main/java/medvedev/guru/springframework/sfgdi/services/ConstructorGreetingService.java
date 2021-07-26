package medvedev.guru.springframework.sfgdi.services;



/**
 * @author Denis Medvedev
 */

public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
