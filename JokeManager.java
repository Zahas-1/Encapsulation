import java.util.ArrayList;
import java.util.Random;

// Class to manage jokes
public class JokeManager {
    ArrayList<String> jokesList; // ArrayList to store jokes

    // Constructor to initialize the jokesList
    public JokeManager() {
        this.jokesList = new ArrayList<>();
    }

    // Method to add a joke to the jokesList
    public void addJoke(String joke) {
        jokesList.add(joke);
    }

    // Method to randomly draw a joke from the jokesList
    public String drawJoke() {
        // Check if jokesList is empty
        if (jokesList.isEmpty()) {
            return "Jokes are in short supply.";
        }
        // Generate a random index within the size of jokesList
        Random random = new Random();
        int index = random.nextInt(jokesList.size());
        // Return the joke at the generated index
        return jokesList.get(index);
    }

    // Method to print all jokes in the jokesList
    public void printJokes() {
        // Iterate through each joke in jokesList and print it
        for (String joke : jokesList) {
            System.out.println(joke);
        }
    }

    // Main method for testing the JokeManager class
    public static void main(String[] args) {
        // Create a new JokeManager object
        JokeManager manager = new JokeManager();
        // Add jokes to the manager
        manager.addJoke("What is red and smells of blue paint? - Red paint.");
        manager.addJoke("What is blue and smells of red paint? - Blue paint.");

        // Print a header for drawing jokes
        System.out.println("Drawing jokes:");
        // Draw and print 5 jokes
        for (int i = 0; i < 5; i++) {
            System.out.println(manager.drawJoke());
        }

        // Print a blank line for separation
        System.out.println("");
        // Print a header for printing jokes
        System.out.println("Printing jokes:");
        // Print all jokes in the manager
        manager.printJokes();
    }
}
