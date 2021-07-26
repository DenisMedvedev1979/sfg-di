package medvedev.guru.springframework.sfgdi.services;


/**
 * @author Denis Medvedev
 */

public class I18nEnglishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
