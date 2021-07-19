package medvedev.guru.springframework.sfgdi.controllers;

import medvedev.guru.springframework.sfgdi.services.PetService;

/**
 * @author Denis Medvedev
 */
public class PetController {

    private final PetService petService;

    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
