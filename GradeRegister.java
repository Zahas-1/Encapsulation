import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Integer> grades; // ArrayList to store grades based on points
    private ArrayList<Integer> gradeStore; // ArrayList to store points

    // Constructor to initialize GradeRegister with empty ArrayLists
    public GradeRegister() {
        this.grades = new ArrayList<>(); // Initialize ArrayList to store grades
        this.gradeStore = new ArrayList<>(); // Initialize ArrayList to store points
    }

    // Method to add a grade based on points
    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrades(points)); // Add grade calculated from points to grades ArrayList
        this.gradeStore.add(points); // Store the points in the gradeStore ArrayList
    }

    // Method to calculate the average of points
    public double averageOfPoints() {
        int totalPoints = 0; // Variable to store the total points
        for (int points : gradeStore) { // Loop through each points in gradeStore
            totalPoints += points; // Add points to totalPoints
        }
        return (double) totalPoints / gradeStore.size(); // Calculate and return the average points
    }

    // Method to count the number of grades equal to a specified grade
    public int numberOfGrades(int grade) {
        int count = 0; // Variable to store the count of grades equal to specified grade
        for (int received : this.grades) { // Loop through each grade in grades ArrayList
            if (received == grade) { // Check if the grade is equal to specified grade
                count++; // Increment the count
            }
        }
        return count; // Return the count of grades equal to specified grade
    }

    // Method to calculate the average of grades
    public double averageOfGrades() {
        if (grades.isEmpty()) { // Check if the grades ArrayList is empty
            return -1.00; // Return -1 if no grades are available
        }
        return gradeTotal() / noOfGrades(); // Calculate and return the average of grades
    }

    // Method to calculate the total sum of grades
    public double gradeTotal() {
        int total = 0; // Variable to store the total sum of grades
        for (int grades : grades) { // Loop through each grade in grades ArrayList
            total += grades; // Add grade to total
        }
        return total; // Return the total sum of grades
    }

    // Method to return the number of grades
    public double noOfGrades() {
        return grades.size(); // Return the number of grades in grades ArrayList
    }

    // Method to convert points to grades
    public static int pointsToGrades(int points) {
        int grade = 0; // Variable to store the grade
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        return grade; // Return the calculated grade
    }
}
