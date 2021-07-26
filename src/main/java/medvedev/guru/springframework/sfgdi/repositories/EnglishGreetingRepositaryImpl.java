package medvedev.guru.springframework.sfgdi.repositories;

/**
 * @author Denis Medvedev
 */
public class EnglishGreetingRepositaryImpl implements EnglishGreetingRepositary {
    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
