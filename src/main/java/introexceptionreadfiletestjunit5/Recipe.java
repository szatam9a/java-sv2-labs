package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    List<String > ingredients = new ArrayList<>();

    void addIngredients(Path path){

        List<String> tempList = readIn(path);
//        tempList.remove(0);
//        tempList.remove(0);

        for (String lines:tempList
             ) {
                String[] tempArray = lines.split(" ");
                if (tempArray.length==3) {
                    ingredients.add(tempArray[2]);
                }
        }
    }
    private List<String> readIn(Path path){
        try {
            return Files.readAllLines(path);
        }catch (IOException e){
            throw new IllegalArgumentException("no file", e);
        }
    }
    public List<String> getIngredients() {
        return ingredients;
    }
}
