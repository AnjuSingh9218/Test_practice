
public class SecondLargestElement {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = { 4, 6, 8, 9, 3, 2 };
        int size1 = a.length;
        int temp;
        for (int i = 0; i < size1; i++) {
            for (int j = i + 1; j < size1; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(a[i] + " ");

        }
        System.out.println("Second largest Element of Array:" + a[size1 - 2]);

    }

}
