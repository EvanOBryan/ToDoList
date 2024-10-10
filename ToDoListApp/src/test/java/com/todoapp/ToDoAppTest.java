package test.java.com.todoapp;
import main.java.com.todoapp.ToDoList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToDoAppTest {

    private ToDoList toDoList;

    @BeforeEach
    public void setUp() {
        toDoList = new ToDoList();
    }

    @Test
    public void testAddItem() {
        toDoList.addItem("New Task");
        assertEquals(1, toDoList.getItems().size());
        assertEquals("New Task", toDoList.getItems().get(0).getDescription());
    }

    @Test
    public void testMarkItemAsCompleted() {
        toDoList.addItem("New Task");
        toDoList.markItemAsCompleted(0);
        assertTrue(toDoList.getItems().get(0).isCompleted());
    }

    @Test
    public void testMarkItemAsCompletedInvalidIndex() {
        Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            toDoList.markItemAsCompleted(5);
        });
        assertEquals("Invalid index", exception.getMessage());
    }
}