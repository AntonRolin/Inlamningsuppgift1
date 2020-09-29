/**
 * Created by: Anton Rolin
 * Date: 27/09/2020
 * Time: 18:29
 * Project: Inlamningsuppgift1
 * Copyright: MIT
 */
public class Snake extends Pet {

    public Snake(String name, int weight){
        super(name, weight);
        this.foodType = FoodType.Ormpellets;
        this.gramsOfFood = 20;
    }
}
