import java.util.Arrays;
import java.util.Scanner;

public class deleteElement {

    public static void main(String[] args) {
        int arr[] = { 1, 9, 6, 8, 4, 7, 3 };
        int index = 0;
        System.out.println("find the number whose index you want to find");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int size1 = arr.length;
        for (int i = 0; i < size1; i++) {
            if (num == arr[i]) {
                System.out.println("Index of number is " + i);
                index = i;

            }

        }
        for (int j = index; j < size1 - 1; j++) {
            arr[j] = arr[j + 1];
        }
        System.out.println("After removing the second element: " + Arrays.toString(arr));
    }

}
