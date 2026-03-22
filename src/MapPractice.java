import java.util.HashMap;
import java.util.Map;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> scores = new HashMap<>();

    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    scores.put("Alice", 90);
    scores.put("Bob", 85);
    scores.put("Charlie", 95);

    // Get the value associated with a given key in the Map
    Integer aliceScore = scores.get("Alice");
    System.out.println("Alice's score: " + aliceScore);

    // Find the size (number of key/value pairs) of the Map
    int size = scores.size();
    System.out.println("Map size: " + size);

    // Replace the value associated with a given key (the size of the Map shoukld not change)
    scores.put("Bob", 88);

    // Check whether the Map contains a given key
    boolean hasAlice = scores.containsKey("Alice");
    System.out.println("Contains key 'Alice': " + hasAlice);

    // Check whether the Map contains a given value
    boolean has95 = scores.containsValue(95);
    System.out.println("Contains value 95: " + has95);

    // Iterate over the keys of the Map, printing each key
    System.out.println("Keys:");
    for (String key : scores.keySet()) {
      System.out.println(key);
    }

    // Iterate over the values of the map, printing each value
    System.out.println("Values:");
    for (Integer value : scores.values()) {
      System.out.println(value);
    }

    // Iterate over the entries in the map, printing each key and value
    System.out.println("Entries:");
    for (Map.Entry<String, Integer> entry : scores.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
    
    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
