package medvedev.guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Denis Medvedev
 */
@Service
@Profile("cat")
public class CatPetService implements PetService{

    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
