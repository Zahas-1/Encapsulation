import java.util.Scanner;

public class GradeInterface {
    private GradeRegister register; // Instance variable to hold the GradeRegister object
    private Scanner scanner; // Instance variable to hold the Scanner object

    // Constructor to initialize GradeInterface with a GradeRegister and Scanner
    public GradeInterface(GradeRegister register, Scanner scanner) {
        this.register = register; // Initialize the GradeRegister object
        this.scanner = scanner; // Initialize the Scanner object
    }

    // Method to start the grade interface
    public void start() {
        readPoints(); // Method call to read points from user input
        System.out.println(""); // Print an empty line for formatting
        printGradeDistribution(); // Method call to print grade distribution
    }

    // Method to read points from user input
    public void readPoints() {
        while (true) {
            System.out.print("Points: "); // Prompt the user to enter points
            String input = scanner.nextLine(); // Read user input
            if (input.equals("")) { // Check if input is empty
                break; // Break the loop if input is empty
            }

            int points = Integer.valueOf(input); // Convert input to integer

            if (points < 0 || points > 100) { // Check if points are within valid range
                System.out.println("Impossible number."); // Print error message for invalid points
                continue; // Continue to next iteration of loop
            }

            this.register.addGradeBasedOnPoints(points); // Add grade based on points to GradeRegister
        }
    }

    // Method to print grade distribution
    public void printGradeDistribution() {
        int grade = 5; // Initialize grade to highest grade
        while (grade >= 0) { // Loop through grades from highest to lowest
            int stars = register.numberOfGrades(grade); // Get number of grades for current grade
            System.out.print(grade + ": "); // Print current grade
            printStars(stars); // Print stars representing number of grades
            System.out.println(""); // Print empty line for formatting

            grade = grade - 1; // Decrement grade for next iteration
        }
        System.out.println("The average of points " + register.averageOfPoints()); // Print average of points
        System.out.println("The average of grades " + register.averageOfGrades()); // Print average of grades
    }

    // Method to print stars
    public static void printStars(int stars) {
        while (stars > 0) { // Loop to print stars
            System.out.print("*"); // Print star
            stars--; // Decrement stars
        }
    }
}
