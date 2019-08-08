
public class StringReplace {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "Java";
        String replaced = str.replace("J", "K");
        System.out.println("Orginal string is :" + str);
        System.out.println(" String after Replacement is: " + replaced);

        String str1 = "Scala is Programming Language";
        String Replaces1 = str1.replaceAll("Scala", "Java");
        System.out.println("Orginal string is :" + str1);
        System.out.println(" String after Replacement is: " + Replaces1);

        String str2 = "Scala is Programming Language";
        String Replaces2 = str2.replaceFirst("\\s", "#");
        System.out.println("Orginal string is :" + str2);
        System.out.println(" String after Replacement is: " + Replaces2);

        String str3 = "Scala is Programming Language";
        String Replaces3 = str3.replaceAll("\\s", "#");
        System.out.println("Orginal string is :" + str3);
        System.out.println(" String after Replacement is: " + Replaces3);

    }

}
