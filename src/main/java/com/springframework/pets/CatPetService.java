package com.springframework.pets;



/**
 * @author Denis Medvedev
 */

public class CatPetService implements PetService{

    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
