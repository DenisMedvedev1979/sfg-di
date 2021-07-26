package medvedev.guru.springframework.sfgdi.services;



/**
 * @author Denis Medvedev
 */

public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - from PRIMARY Bean";
    }
}
