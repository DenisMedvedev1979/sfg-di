package medvedev.guru.springframework.sfgdi.services;

/**
 * @author Denis Medvedev
 */
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
