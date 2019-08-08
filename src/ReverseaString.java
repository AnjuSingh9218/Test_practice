
public class ReverseaString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "Anju";
        int size = str.length();
        String Reverse = "";
        for (int i = size - 1; i >= 0; i--) {
            Reverse = Reverse + str.charAt(i);

        }
        System.out.println(Reverse);

    }

}
