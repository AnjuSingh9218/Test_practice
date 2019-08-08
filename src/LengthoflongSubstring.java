import java.util.LinkedHashMap;
import java.util.Map;

public class LengthoflongSubstring {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = " GEEKSFORGEEKS";
        String longestSubstring = null;
        int longestSubstringLength = 0;
        int size = str.length();
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < size; i++) {
            char Char = str.charAt(i);
            if (!map.containsKey(Char)) {
                map.put(Char, i);
            } else {
                i = map.get(Char);
                map.clear();
            }
        }
        if (map.size() > longestSubstringLength) {
            longestSubstringLength = map.size();
            longestSubstring = map.keySet().toString();
            System.out.println(longestSubstring);
        }

    }
}
