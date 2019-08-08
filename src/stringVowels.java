
public class stringVowels {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "AnjuSingh";
        int size = str.length();
        int vowel = 0, constant = 0;
        for (int i = 0; i < size; i++) {
            char val = str.charAt(i);
            if (Character.toUpperCase(val) == 'A' || Character.toUpperCase(val) == 'E' || Character.toUpperCase(val) == 'I' ||
                            Character.toUpperCase(val) == 'O' || Character.toUpperCase(val) == 'U') {
                vowel = vowel + 1;
            } else {
                constant = constant + 1;
            }
        }
        System.out.println("number of Vowels : " + vowel);
        System.out.println("number of Constant : " + constant);

    }

}
