package medvedev.guru.springframework.sfgdi.services;


import medvedev.guru.springframework.sfgdi.repositories.EnglishGreetingRepositary;

/**
 * @author Denis Medvedev
 */

public class I18nEnglishGreetingService implements GreetingService {

    private final EnglishGreetingRepositary englishGreetingRepositary;

    public I18nEnglishGreetingService(EnglishGreetingRepositary englishGreetingRepositary) {
        this.englishGreetingRepositary = englishGreetingRepositary;
    }

    @Override
    public String sayGreeting() {
        return englishGreetingRepositary.getGreeting();
    }
}
