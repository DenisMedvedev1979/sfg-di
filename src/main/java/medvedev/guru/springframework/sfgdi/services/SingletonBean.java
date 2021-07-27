package medvedev.guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

/**
 * @author Denis Medvedev
 */
@Component
public class SingletonBean {

    public SingletonBean() {

        System.out.println("Creating a Singleton Bean!!!");
    }

    public String getMyScope() {
        return "I'm a Singleton";
    }
}
