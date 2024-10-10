package main.java.com.todoapp;

public class ToDoItem {
    private String description;
    private boolean completed;

    public ToDoItem(String description) {
        this.description = description;
        this.completed = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return description + " [" + (completed ? "Completed" : "Not Completed") + "]";
    }
}