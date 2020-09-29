import javax.swing.*;
import java.util.*;

/**
 * Created by: Anton Rolin
 * Date: 27/09/2020
 * Time: 18:32
 * Project: Inlamningsuppgift1
 * Copyright: MIT
 */
public class MainDemo {
    public static void main(String[] args){
        IPetHotel petHotel = new PetHotel();

    //Lista med alla djur som finns på hotellet skapas
        List<Pet> pets = new ArrayList<>();
        pets.add(new Dog("Sixten", 5000));
        pets.add(new Dog("Dogge", 10000));
        pets.add(new Cat("Venus", 5000));
        pets.add(new Cat("Ove", 3000));
        pets.add(new Snake("Hypno", 1000));

        petHotel.addPetList(pets);


    //Input och output
        String input = JOptionPane.showInputDialog("Vilket djur ska få mat?");
        if(input != null) {
            String output = petHotel.getFoodPortion(input);
            if (output != null)
                JOptionPane.showMessageDialog(null, output);
            else
                JOptionPane.showMessageDialog(null, "Namnet finns inte i systemet", "Ogiltig inmatning", JOptionPane.ERROR_MESSAGE);
        }
        else
            System.exit(0);


    }
}
