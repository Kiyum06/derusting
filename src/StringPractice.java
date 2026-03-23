import java.util.ArrayList;
import java.util.List;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String text = "Hello";

    // Find the length of the string
    int length = text.length();
    System.out.println("Length: " + length);

    // Concatenate (add) two strings together and reassign the result
    text = text + " World";
    System.out.println("Concatenated string: " + text);

    // Find the value of the character at index 3
    char character = text.charAt(3);
    System.out.println("Character at index 3: " + character);

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    boolean contains = text.contains("abc");
    System.out.println("Contains 'abc': " + contains);

    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < text.length(); i++) {
      System.out.println(text.charAt(i));
    }

    // Create an ArrayList of Strings and assign it to a variable
    List<String> words = new ArrayList<>();

    // Add multiple strings to the List (OK to do one-by-one)
    words.add("Java");
    words.add("Python");
    words.add("C++");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joined = String.join(",", words);
    System.out.println("Joined string: " + joined);

    // Check whether two strings are equal
    String a = "hello";
    String b = "hello";

    boolean equal = a.equals(b);
    System.out.println("Strings equal: " + equal);
    
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
