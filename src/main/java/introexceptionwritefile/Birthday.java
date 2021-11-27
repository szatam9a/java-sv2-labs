package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {
    public List<String> listOfYourFamily = new ArrayList<>();

    public String inputForTheList(){
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.println("név");
        sb.append(scanner.nextLine());
        System.out.println("születésidatum");
        sb.append(" "+scanner.nextLine());

        return sb.toString();
    }

    public void control (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("mennyi rokon?");
        String familyCounter = scanner.nextLine();
        addToList(familyCounterCheck(familyCounter));
        writeToFile();
    }

    public void writeToFile(){
        try {
            Files.write(Path.of("Birthday.txt"),listOfYourFamily);
        } catch (IOException e){
            throw new IllegalStateException("Cant write it", e);
        }
    }
    private void addToList(int familyCounter){
        for (int i=0;i<familyCounter;i++)
        {
            listOfYourFamily.add(inputForTheList());
        }
    }
    private int familyCounterCheck(String family){
        int result = 0;
        try {
             result = Integer.parseInt(family);
             return result;
        } catch (IllegalArgumentException e){
            System.out.println("nem szám");
            control();
        }
        return result;
    }
}
