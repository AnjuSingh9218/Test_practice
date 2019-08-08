import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MaximumOcuuringCharacter {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "AnjuSSsSingh";
        int size = str.length();
        Map<Character, Integer> Duplicate = new HashMap<Character, Integer>();
        for (int i = 0; i < size; i++) {
            char Char = str.charAt(i);
            if (!Duplicate.containsKey(Char)) {
                Duplicate.put(Char, 1);

            } else {
                Duplicate.put(Char, Duplicate.get(Char) + 1);
            }
        }
        // System.out.println(Duplicate);
        int maxValueInMap = (Collections.max(Duplicate.values())); // This will return max value in the Hashmap
        for (Entry<Character, Integer> entry : Duplicate.entrySet()) { // Itrate through hashmap
            if (entry.getValue() == maxValueInMap) {
                System.out.println(entry.getKey()); // Print the key with max value
            }
        }

    }

}
