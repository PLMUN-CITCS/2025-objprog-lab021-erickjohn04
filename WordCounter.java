import java.util.Scanner;

public class WordCounter {

    // Method to get the sentence input from the user
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        return scanner.nextLine();
    }

    // Method to count the number of words in the sentence
    public static int countWords(String sentence) {
        // Trim the sentence to remove leading and trailing spaces, then split it by spaces
        String[] words = sentence.trim().split("\\s+");
        
        // Return the number of words, handling edge case of empty input
        return (sentence.trim().isEmpty()) ? 0 : words.length;
    }

    public static void main(String[] args) {
        // Get the sentence input from the user
        String sentence = getInput();

        // Count the words in the sentence
        int wordCount = countWords(sentence);

        // Display the result
        System.out.println("The sentence has " + wordCount + " words.");
    }
}
