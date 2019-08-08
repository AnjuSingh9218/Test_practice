
public class differencelargandsmall {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = { 2, 6, 3, 8, 9, 5, 15 };
        int size = a.length;
        int temp;
        int num;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(a[i]);

        }
        num = a[size - 1] - a[0];
        System.out.println("Difference between largest and Smallest number is :" + num);
    }

}
