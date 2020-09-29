/**
 * Created by: Anton Rolin
 * Date: 27/09/2020
 * Time: 18:29
 * Project: Inlamningsuppgift1
 * Copyright: MIT
 */

/**
 * Superklass som innehåller generell information om alla djurinstanser
 */
public class Pet{

    private String name;
    private int weight;
    protected FoodType foodType;
    protected double gramsOfFood;


    public Pet(){}

    public Pet(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public double getGramsOfFood() {
        return gramsOfFood;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public String getName() {
        return name;
    }
}
