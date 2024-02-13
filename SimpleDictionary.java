import java.util.HashMap;

// Class to represent a simple dictionary with word translations
public class SimpleDictionary {
    // HashMap to store word translations
    private HashMap<String, String> dictionary;

    // Constructor to initialize the dictionary
    public SimpleDictionary() {
        this.dictionary = new HashMap<>();
    }

    // Method to add a word and its translation to the dictionary
    public void add(String word, String translation) {
        this.dictionary.put(word, translation);
    }

    // Method to translate a word to its corresponding translation
    // Returns the translation if found, otherwise returns null
    public String translate(String word) {
        return this.dictionary.get(word);
    }
}
