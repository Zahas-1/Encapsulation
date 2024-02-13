import java.util.Scanner;
public class TextUI {
    //Create instance variables
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;
    //Constructor that will take 2 parameters
    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary){
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
    //Method to initialise the program
    public void start(){
        while(true){
            //Input to take from the user
            System.out.print("Command: ");
            String text = scanner.next();
            //Exit case to end the program
            if(text.equals("end")){
                System.out.println("Bye bye!");
                break;
            //Check if the user entered add, if so, user must input another 2 words to be added into the program
            } else if(text.equals("add")){
                System.out.print("Word: ");
                String word = scanner.next();
                System.out.print("Translation: ");
                String translation = scanner.next();
                simpleDictionary.add(word, translation);
            //If the user entered search, check the program for a translation of the next word the user enters
            } else if(text.equals("search")){
                System.out.print("To be translated: ");
                String toTranslate = scanner.next();
                //Check if the user entered word doesn't have a translation
                if(simpleDictionary.translate(toTranslate) == null){
                    System.out.println("Word " + toTranslate + " was not found");
                }
                //If the translation exists, print this.
                else System.out.println(simpleDictionary.translate(toTranslate));
            }
            //If the user enters a command that doesn't exist, print this.
            else System.out.println("Unknown command");
        }
    }

    //Test code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI textUI = new TextUI(scanner, dictionary);
        textUI.start();
        System.out.println(dictionary.translate("pike")); // prints the string "hauki"
    }
}
