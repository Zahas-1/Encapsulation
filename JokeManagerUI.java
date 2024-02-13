import java.util.Scanner;

// Class to manage user interface for JokeManager
public class JokeManagerUI {
    private Scanner scanner;        // Scanner object for user input
    private JokeManager jokeManager; // JokeManager object to manage jokes

    // Constructor to initialize JokeManagerUI with a JokeManager and Scanner
    public JokeManagerUI(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    // Method to start the user interface
    public void start() {
        // Loop to continuously prompt user for commands
        while (true) {
            // Display available commands
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            // Read user input
            String input = scanner.nextLine();

            // Check if user wants to stop
            if (input.equals("X")) {
                break;
            }

            // Process user commands
            if (input.equals("1")) { // Add a joke
                System.out.println("Write the joke to be added:");
                String newJoke = scanner.nextLine();
                jokeManager.addJoke(newJoke);
            } else if (input.equals("2")) { // Draw a joke
                if (jokeManager.jokesList.isEmpty()) {
                    System.out.println("Jokes are in short supply.");
                } else {
                    System.out.println(jokeManager.drawJoke());
                }
            } else if (input.equals("3")) { // List all jokes
                jokeManager.printJokes();
            }
        }
    }

    // Main method for testing JokeManagerUI
    public static void main(String[] args) {
        // Create a new JokeManager object
        JokeManager manager = new JokeManager();
        // Create a new Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create a new JokeManagerUI object and start the interface
        JokeManagerUI ui = new JokeManagerUI(manager, scanner);
        ui.start();
    }
}
