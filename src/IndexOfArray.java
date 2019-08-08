import java.util.Scanner;

public class IndexOfArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = { 1, 9, 6, 8, 4, 7, 3 };
        System.out.println("find the number whose index you want to find");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int size1 = arr.length;
        for (int i = 0; i < size1; i++) {
            if (num == arr[i]) {
                System.out.println("Index of number is " + i);
            }
        }

    }

}
