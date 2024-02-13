import java.util.Scanner;

// Class to demonstrate the GradeInterface
public class GradeUI {

    // Main method to start the application
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the console

        GradeRegister register = new GradeRegister(); // Create a GradeRegister object to store grades

        // Create a GradeInterface object to interact with the user and pass the GradeRegister and Scanner objects
        GradeInterface userInterface = new GradeInterface(register, scanner);

        userInterface.start(); // Start the GradeInterface
    }
}
