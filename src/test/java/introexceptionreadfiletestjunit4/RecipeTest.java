package introexceptionreadfiletestjunit4;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecipeTest {
    Recipe recipe;

    @Test
    public void addIngredients() {
        recipe = new Recipe();
        recipe.addIngredients(Path.of("src/test/resources/recipe.txt"));
        assertEquals(Arrays.asList("liszt",
                "margarin",
                "kristálycukor",
                "tojás",
                "citrom",
                "sütőpor",
                "vanillincukor",
                "tejföl",
                "alma",
                "fahéj"), recipe.getIngredients());
    }
}