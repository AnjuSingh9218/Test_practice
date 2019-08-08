
public class oppositestars {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i, j, k, n = 5, l = 4;
        for (i = 0; i < n; i++) {
            for (j = l; j >= i; j--) {
                System.out.print(" ");
            }

            for (k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
