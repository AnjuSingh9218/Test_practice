import java.util.Scanner;

public class ReversePalindrome {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str, Reverse = "";
        Scanner Sc = new Scanner(System.in);
        System.out.println("Eneter a String");
        str = Sc.nextLine();
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            Reverse = Reverse + str.charAt(i);
        }
        if (str.equalsIgnoreCase(Reverse)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not palindrome");
        }

    }

}
