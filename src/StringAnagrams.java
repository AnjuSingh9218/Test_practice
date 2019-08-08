import java.util.Arrays;

public class StringAnagrams {

    // Strings Anagram
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str1 = "Anju";
        String str2 = "Anju";
        boolean status = true;
        int len1 = str1.length();
        int len2 = str2.length();
        if (len1 != len2) {
            status = false;

        }

        else {

            char[] Array1 = str1.toLowerCase().toCharArray();
            char[] Array2 = str2.toLowerCase().toCharArray();
            Arrays.sort(Array1);
            Arrays.sort(Array2);
            status = Arrays.equals(Array1, Array2);
        }
        if (status == true) {
            System.out.println("They are anagram");
        } else {
            System.out.println("they are not anagram");
        }

    }

}
