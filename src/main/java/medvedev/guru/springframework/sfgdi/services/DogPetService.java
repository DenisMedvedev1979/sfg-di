package medvedev.guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;

/**
 * @author Denis Medvedev
 */
@Profile({"dog", "default"})
public class DogPetService {
    public String getPetType(){
        return "Dogs are the best!";
    }
}
