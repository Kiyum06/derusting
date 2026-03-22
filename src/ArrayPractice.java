public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] words = new String[4];

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    words[0] = "Apple";
    words[1] = "Banana";
    words[2] = "Orange";
    words[3] = "Mango";

    // Get the value of the array at index 2
    String valueAtIndex2 = words[2];
    System.out.println("Value at index 2: " + valueAtIndex2);

    // Get the length of the array
    int length = words.length;
    System.out.println("Array length: " + length);

    // Iterate over the array using a traditional for loop and print out each item
    System.out.println("Using traditional for loop:");
    for(int i = 0; i < words.length; i++) {
      System.out.println(words[i]);
    }

    // Iterate over the array using a for-each loop and print out each item
    System.out.println("Using for-each loop:");
    for(String word : words) {
      System.out.println(word);
    }
    
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
