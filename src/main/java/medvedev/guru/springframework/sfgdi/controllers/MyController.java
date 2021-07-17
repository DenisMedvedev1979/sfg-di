package medvedev.guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author Denis Medvedev
 */
@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello World");

        return "Hi Folks!";
    }
}
