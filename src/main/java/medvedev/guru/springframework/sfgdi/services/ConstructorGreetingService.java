package medvedev.guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author Denis Medvedev
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
