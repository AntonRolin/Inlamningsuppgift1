/**
 * Created by: Anton Rolin
 * Date: 27/09/2020
 * Time: 18:29
 * Project: Inlamningsuppgift1
 * Copyright: MIT
 */
public class Dog extends Pet {

    public Dog(String name, int weight){
        super(name, weight);
        this.foodType = FoodType.Hundfoder;
        this.gramsOfFood = weight/100;
    }


}
