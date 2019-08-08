import java.util.Scanner;

public class InsertatSpecific_shift {

    public static void main(String[] args) {
        int a[] = { 8, 9, 4, 7, 3, 2 };
        int size = a.length;
        System.out.println("Enter the number whose square should be equal");
        System.out.println();
        int count = 0;
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int firstSequence = 0;
        int SecondSequence = 0;
        int val = num * num;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                firstSequence = a[i] * a[i];
                SecondSequence = a[j] * a[j];
                if (val == firstSequence + SecondSequence) {
                    System.out.println("square of this number : " + num + " num1: " + a[i] + "  num2: " + a[j]);

                }

            }

        }

    }
}
