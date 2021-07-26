package medvedev.guru.springframework.sfgdi.config;

import medvedev.guru.springframework.sfgdi.repositories.EnglishGreetingRepositary;
import medvedev.guru.springframework.sfgdi.repositories.EnglishGreetingRepositaryImpl;
import medvedev.guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.*;

/**
 * @author Denis Medvedev
 */
@Configuration
public class GreetingServiceConfig {

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18NSpanishService i18NSpanishService() {
        return new I18NSpanishService();
    }

    @Bean
    EnglishGreetingRepositary englishGreetingRepositary() {
        return new EnglishGreetingRepositaryImpl();
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingService i18nService(EnglishGreetingRepositary englishGreetingRepositary) {
        return new I18nEnglishGreetingService(englishGreetingRepositary);
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }
}
