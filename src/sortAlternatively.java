import java.util.Arrays;

public class sortAlternatively {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int array[] = { 7, 4, 2, 9, 15, 0, 6 };
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] < array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            } else {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }

}
