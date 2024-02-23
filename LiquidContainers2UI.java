import java.util.Scanner;
public class LiquidContainers2UI {
    public static void main(String[] args){
        Container first = new Container();
        Container second = new Container();
        Scanner scanner = new Scanner(System.in);

        // Loop to continuously prompt user for commands until "quit" is entered
        while (true) {
            // Print the current amounts of liquid in both containers
            printContainerAmounts(first, second);

            // Read user input
            String user = scanner.nextLine();
            // Split the input into parts based on spaces
            String[] parts = user.split(" ");
            // Extract the command from the input
            String command = parts[0];

            // Check if the user wants to quit the program
            if (command.equals("quit")) {
                System.out.println("quitting");
                break;
            }
            // Process user commands
            switch (command) {
                case "add":
                    first.add(Integer.valueOf(parts[1]));
                    break;
                case "move":
                    int amount = Integer.valueOf(parts[1]);
                    first.remove(amount);
                    second.add(amount);
                    break;
                case "remove":
                    second.remove(Integer.valueOf(parts[1]));
                    break;
                default:
                    System.out.println("Unknown command");
            }

        }
    }
    private static void printContainerAmounts(Container first, Container second) {
        System.out.println("First: " + first.contains());
        System.out.println("Second: " + second.contains());
    }
}
