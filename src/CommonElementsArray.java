
public class CommonElementsArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = { 5, 8, 6, 9, 4 };
        int b[] = { 1, 5, 8, 3, 2 };
        int size1 = a.length;
        int size2 = b.length;
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (a[i] == b[j]) {
                    System.out.println("value Common in array is :" + a[i]);

                }
            }
        }

    }

}
