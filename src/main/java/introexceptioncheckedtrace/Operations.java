package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

public class Operations {
    public List<String> readFile() throws IOException{
        return Files.readAllLines(Path.of("src/main/java/introexceptioncheckedtrace/underground.txt"));
    }
    public String getDailySchedule(List<String> list){
        StringBuilder metroCarNumbers = new StringBuilder();
        metroCarNumbers.append(LocalDate.now()).append(", ");

        for (String car:list
             ) {
             if (car.charAt(0)=='2'){
                 metroCarNumbers.append(car).append(" ");
             }
        }

    return metroCarNumbers.toString();}

    public static void main(String[] args) {
        Operations operations = new Operations();
        try {
            System.out.println(operations.getDailySchedule(operations.readFile()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
