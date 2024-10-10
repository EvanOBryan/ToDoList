package main.java.com.todoapp;
import java.util.ArrayList;

public class ToDoList {
    private ArrayList<ToDoItem> items;

    public ToDoList() {
        items = new ArrayList<>();
    }

    public void addItem(String description) {
        items.add(new ToDoItem(description));
    }

    public void markItemAsCompleted(int index) {
        if (index >= 0 && index < items.size()) {
            items.get(index).markAsCompleted();
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    public ArrayList<ToDoItem> getItems() {
        return items;
    }

    public void displayItems() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(i + ". " + items.get(i));
        }
    }
}