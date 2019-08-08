
public class equalityofArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int b[] = { 1, 2, 3, 4, 5, 7 };
        boolean equal = false;
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == b[i]) {
                    equal = true;
                } else {
                    equal = false;
                }
            }
        }
        if (equal == true) {
            System.out.println("arrays are equal");
        } else {
            System.out.println("arrays are not equal");
        }
    }

}
