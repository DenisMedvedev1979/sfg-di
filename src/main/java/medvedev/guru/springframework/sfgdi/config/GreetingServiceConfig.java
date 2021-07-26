package medvedev.guru.springframework.sfgdi.config;

import medvedev.guru.springframework.sfgdi.services.ConstructorGreetingService;
import medvedev.guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import medvedev.guru.springframework.sfgdi.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Denis Medvedev
 */
@Configuration
public class GreetingServiceConfig {

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
