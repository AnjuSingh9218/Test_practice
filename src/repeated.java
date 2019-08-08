import java.util.HashMap;
import java.util.Map;

public class repeated {

    public static void main(String[] args) {

        // sample test string
        String testStr = "Spring and Hibernate";

        // invoke to count & print for supplied file
        countAndPrintRepeatedCharacterOccurences(testStr);
    }

    /**
     * this method is used to count number repeated word occurrences
     * 
     * @param fileName
     */
    public static void countAndPrintRepeatedCharacterOccurences(String strContent) {

        // Step 1: create Map of Character-Integer
        Map<Character, Integer> mapOfRepeatedChar = new HashMap<Character, Integer>();

        // Step 2: convert String into character-array
        // using toCharArray() method
        char[] chArray = strContent.toCharArray();

        // Step 3: iterate through char[] array
        for (char ch : chArray) {

            // Step 4: leave spaces
            if (ch != ' ') {

                // Step 5: check
                // whether Map contains particular character
                if (mapOfRepeatedChar.containsKey(ch)) {

                    // Step 6: If contains,
                    // increase count value by 1
                    mapOfRepeatedChar.put(ch, mapOfRepeatedChar.get(ch) + 1);
                } else {

                    // Step 7: otherwise, make a new entry
                    mapOfRepeatedChar.put(ch, 1);
                }
            }
        }

        System.out.println("Before sorting : \n");
        System.out.println("Char" + "\t" + "Count");
        System.out.println("====" + "\t" + "=====");
    }
}
