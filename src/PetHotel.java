import javax.swing.*;
import java.util.*;

/**
 * Created by: Anton Rolin
 * Date: 27/09/2020
 * Time: 20:52
 * Project: Inlamningsuppgift1
 * Copyright: MIT
 */

/**
 * Klass som har en lista med alla djur på hotellet och deras attributer <br>
 * Tar input från användaren och kollar ifall namnet är giltigt och vilket djur det tillhör
 */
public class PetHotel implements IPetFood{

    List<Pet> pets;

    public PetHotel(List<Pet> pets){
        this.pets = pets;
    }

    @Override
    public String getFoodPortion(String name) {

        for (Pet pet : pets ) {

            if(name.equalsIgnoreCase(pet.getName())){
                return name +" ska ha "+pet.getGramsOfFood() +"g av typen "+ pet.getFoodType();
            }
        }
            return null;
    }
}
