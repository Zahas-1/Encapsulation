import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> task; // ArrayList to store tasks

    // Constructor to initialize the task ArrayList
    public TodoList(){
        this.task = new ArrayList<>();
    }

    // Method to add a task to the todo list
    public void add(String uTask){
        this.task.add(uTask); // Adding task to the ArrayList
    }

    // Method to print all tasks in the todo list
    public void print(){
        int index = 0; // Initialize index counter
        for(String tasks : this.task){ // Loop through each task in the ArrayList
            // Print the index of the task followed by the task itself
            System.out.println(index++ + 1 + " " + tasks);
        }
    }

    // Method to remove a task from the todo list based on its index
    public void remove(int number){
        this.task.remove(number); // Remove task at the specified index
    }

    public static void main(String[] args) {
        TodoList list = new TodoList(); // Create a new TodoList object
    }
}
