package com.springframework.pets;



/**
 * @author Denis Medvedev
 */

public class DogPetService implements PetService{
    public String getPetType(){
        return "Dogs are the best!";
    }
}
