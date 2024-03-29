import java.util.Arrays;

public class arraywithout0and1 {
    public static void main(String[] args) {
        int[] array_nums = { 50, 77, 12, 54, 0 };
        System.out.println("Original Array: " + Arrays.toString(array_nums));
        System.out.println("Result: " + test(array_nums));
    }

    public static boolean test(int[] numbers) {
        for (int number : numbers) {
            if (number == 0 || number == -1) {
                return false;
            }
        }
        return true;
    }
}