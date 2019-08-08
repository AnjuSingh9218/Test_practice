import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepated {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "Anjujyoti";
        int size = str.length();
        Map<Character, Integer> Duplicate = new LinkedHashMap<Character, Integer>();
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

            if (entry.getValue() == 1) {
                System.out.println("First Non Repeated Character" + entry.getKey() + " = " + entry.getValue());
                break;
            }
        }

    }

}
