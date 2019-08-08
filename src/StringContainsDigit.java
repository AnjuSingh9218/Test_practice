import java.util.regex.Pattern;

public class StringContainsDigit {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Pattern pattern = Pattern.compile(".*[^0-9].*");
        String[] numbers = { "123", "1234", "123.12", "abcd123", "123456" };
        for (String input : numbers) {
            System.out.println("does " + input + " is number : " + !pattern.matcher(input).matches());
        }

        Pattern pattern1 = Pattern.compile(".*[(X)].*");
        String[] Input = { "(X)anju", "1234", "123.12", "abcd123", "123456" };
        for (String input : Input) {
            System.out.println("does " + Input + " is number : " + pattern.matcher(input).matches());
        }

    }

}
