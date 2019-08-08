import java.util.HashMap;
import java.util.Map;

public class duplicatecharacters {
    public void repeated(String str, int n) {
        Map<Character, Integer> numchars = new HashMap<Character, Integer>();
        for (int i = 0; i < n - 1; i++) {
            char charAt = str.charAt(i);
            if (!numchars.containsKey(charAt)) {
                numchars.put(charAt, 1);
            } else {
                numchars.put(charAt, numchars.get(charAt) + 1);

            }

        }
        System.out.println(numchars);

    }

    public static void main(String[] args) {
        String str = "Hello World";
        int n = str.length();
        duplicatecharacters rep = new duplicatecharacters();

        rep.repeated(str, n);

    }

}
