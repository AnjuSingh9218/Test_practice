import java.util.HashMap;
import java.util.Map;

public class printduplicatecharactersString {

    // How do you print duplicate characters from a string?
    public static void main(String[] args) {
        String str = "Anjujyoti";
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
        System.out.println(Duplicate);
        // for(Duplicate.Entry<Character,Integer> entry:Duplicate.entrySet()) {

        for (Map.Entry<Character, Integer> entry : Duplicate.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }

    }

}
