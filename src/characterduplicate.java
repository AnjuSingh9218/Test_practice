
public class characterduplicate {

    static void duplicate(String str, int n) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count = count + 1;

                }

            }
            System.out.println(str.charAt(i) + "repeated Character" + count);
            // String d = String.valueOf(str.charAt(i)).trim();
            // str = str.replaceAll(d, "");
            // count = 0;

        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "anjuanjusingh";
        int n = str.length();
        duplicate(str, n);

    }

}
