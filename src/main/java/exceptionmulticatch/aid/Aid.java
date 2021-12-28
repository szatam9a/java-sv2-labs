package exceptionmulticatch.aid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Aid {
    private int amount;

    private Path path;

    public Aid(int amount) {
        this.amount = amount;
    }

    public List<String> countAmountOfAid(Path path) {
        List<String> result = new ArrayList<>();
        String[] data;
        try {
            List<String> list = Files.readAllLines(path);
            for (String s : list) {
                data = s.split(":");
                String city = data[0];
                int people = Integer.parseInt(data[1].trim());
                if (people==0) throw new IllegalArgumentException("no people in the city");
                result.add(city + ": " + amount / people);
            }
        } catch (NullPointerException | IOException | IndexOutOfBoundsException | NumberFormatException | ArithmeticException ex) {
            throw new IllegalArgumentException("got a problem", ex);
        }
        return result;
    }
}
