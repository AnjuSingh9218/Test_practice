
public class commonElementsSortedArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = { 1, 3, 4, 7, 5 };
        int b[] = { 4, 7, 9, 1, 2 };
        int c[] = { 8, 3, 4, 1, 9 };
        int size = a.length;
        int size1 = b.length;
        int size2 = c.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size1; j++) {
                if (a[i] == b[j]) {
                    for (int k = 0; k < size2; k++) {
                        if (a[i] == c[k]) {
                            System.out.println("the number which is common :" + a[i]);
                        }
                    }

                }

            }

        }

    }
}
