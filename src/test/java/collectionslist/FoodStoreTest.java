package collectionslist;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FoodStoreTest {
    FoodStore foodStore;
    @Test
    void addFoodTest() {
        foodStore = new FoodStore();
        foodStore.addFood(new Food("Alma", LocalDate.now()));
        foodStore.addFood(new Food("Répa", LocalDate.now()));
        foodStore.sellFirst(new Food("Retek", LocalDate.now()));
        foodStore.sellFirst(new Food("Mogyoro", LocalDate.of(1990,12,10)));
        assertEquals("Retek",foodStore.getFoods().get(0).getName());
    }
}