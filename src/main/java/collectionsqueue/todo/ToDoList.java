package collectionsqueue.todo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ToDoList {
    private List<ToDo> todos = new ArrayList<>();

    public ToDoList(List<ToDo> todos) {
        this.todos = todos;
    }

    public Deque<ToDo> getTodosInUrgencyOrder() {
        Deque<ToDo> result = new ArrayDeque<>();
        for (ToDo toDo : todos) {
            placeThemInRight(toDo, result);
        }
        return result;
    }

    private void placeThemInRight(ToDo todo, Deque<ToDo> result) {
        if (todo.isUrgent()) {
            result.addFirst(todo);
            return;
        }
        result.addLast(todo);
    }

    public List<ToDo> getTodos() {
        return todos;
    }

    public void setTodos(List<ToDo> todos) {
        this.todos = todos;
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList(List.of(new ToDo(true),new ToDo(false),new ToDo(true),new ToDo(false)));
        Deque<ToDo> test = toDoList.getTodosInUrgencyOrder();
        System.out.println(test);
        System.out.println(test.pop());
        System.out.println(test.pop());
        System.out.println(test.pop());
    }
}
