package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ToDo {
    private List<String> todoList = new ArrayList<>();


    public List<String> getTodoList() {
        return todoList;
    }

    public void readInInfinte() {
        Scanner scanner = new Scanner(System.in);
        String typo = scanner.nextLine();
        System.out.println(typo);
        while ((typo.charAt(0)) != 'x') {
            todoList.add(typo);
            typo = scanner.nextLine();
        }
        write();
    }

    private void write() {
        try {
            Files.write(Path.of("todos.txt"), todoList);
        } catch (IOException e) {
            throw new IllegalStateException("cant write a file", e);
        }
    }
}

