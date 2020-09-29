/**
 * Created by: Anton Rolin
 * Date: 27/09/2020
 * Time: 18:29
 * Project: Inlamningsuppgift1
 * Copyright: MIT
 */
public class Cat extends Pet {

    public Cat(String name, int weight){
        super(name, weight);
        this.foodType = FoodType.Kattfoder;
        this.gramsOfFood = weight/150;
    }
}
