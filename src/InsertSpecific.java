import java.util.Arrays;
import java.util.Scanner;

public class InsertSpecific {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = { 8, 9, 4, 7, 3, 2 };
        int count = 0;
        System.out.println("Mention the index where you want to insert an elemnt");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int size1 = a.length;
        for (int i = 0; i < size1; i++) {
            if (i == num) {
                a[i] = 5;
            }

        }
        System.out.println("New array is" + Arrays.toString(a));

    }

}
