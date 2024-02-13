import java.util.Scanner;

public class UserInterface {
    private TodoList todolist; // Reference to TodoList object
    private Scanner scanner; // Scanner object for user input

    // Constructor to initialize UserInterface with TodoList and Scanner objects
    public UserInterface(TodoList todolist, Scanner scanner){
        this.todolist = todolist; // Initialize TodoList object
        this.scanner = scanner; // Initialize Scanner object
    }

    // Method to start the user interface
    public void start(){
        while(true){
            System.out.print("Command: "); // Prompt user for command input
            String command = scanner.nextLine(); // Read user input

            // Check if the command is to stop the program
            if(command.equals("stop")){
                break; // Exit the loop if stop command is entered
            }

            // Check if the command is to add a task
            if (command.equals("add")){
                System.out.println("To add: "); // Prompt user to enter task
                String toAdd = scanner.nextLine(); // Read the task to add
                todolist.add(toAdd); // Add the task to the todo list
            }

            // Check if the command is to list all tasks
            if (command.equals("list")){
                todolist.print(); // Print all tasks in the todo list
            }

            // Check if the command is to remove a task
            if (command.equals("remove")){
                System.out.println("Which one is removed? "); // Prompt user to enter index of task to remove
                int toRemove = Integer.parseInt(scanner.nextLine()); // Read the index of task to remove
                todolist.remove(toRemove - 1); // Remove the task at the specified index
            }
        }
    }

    // Main method to initialize Scanner, TodoList, and UserInterface objects, and start the user interface
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initialize Scanner object for user input
        TodoList todolist = new TodoList(); // Initialize TodoList object to manage tasks
        UserInterface UI = new UserInterface(todolist, scanner); // Initialize UserInterface object with TodoList and Scanner

        UI.start(); // Start the user interface
    }
}
