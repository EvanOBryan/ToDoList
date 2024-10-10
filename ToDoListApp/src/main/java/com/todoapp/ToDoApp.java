package main.java.com.todoapp;

import java.util.Scanner;

public class ToDoApp {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTo-Do List:");
            toDoList.displayItems();

            System.out.println("\nOptions:");
            System.out.println("1. Add item");
            System.out.println("2. Mark item as completed");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    toDoList.addItem(description);
                    break;
                case 2:
                    System.out.print("Enter task number to mark as completed: ");
                    int index = scanner.nextInt();
                    toDoList.markItemAsCompleted(index);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}