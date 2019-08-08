import java.util.HashMap;
import java.util.Map;

public class testRecrosoft {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "Vineet Kumar Gupta";
        int len = str.length();
        Map<Character, Integer> nofCharacter = new HashMap<Character, Integer>();
        for (int i = 0; i < len; i++) {
            char Char = str.charAt(i);
            if (!nofCharacter.containsKey(Char)) {
                nofCharacter.put(Char, 1);
            } else {
                nofCharacter.put(Char, nofCharacter.get(Char) + 1);
            }
        }

        System.out.println(nofCharacter);
    }

}
