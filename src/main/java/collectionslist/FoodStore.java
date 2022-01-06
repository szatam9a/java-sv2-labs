package collectionslist;

import java.time.LocalDate;
import java.util.LinkedList;

public class FoodStore {
    private LinkedList<Food> foods = new LinkedList<>();

    public FoodStore(LinkedList<Food> foods) {
        this.foods = foods;
    }
    public FoodStore() {
    }

    public void addFood(Food food){
        foods.add(food);
    }
    public void sellFirst(Food food){
        if (!food.getBestBefore().isBefore(LocalDate.now())){
            foods.addFirst(food);
            return;
        }
        foods.add(food);
    }
    public LinkedList<Food> getFoods() {
        return foods;
    }
}
