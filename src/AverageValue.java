
public class AverageValue {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = { 1, 6, 8, 9, 3, 4 };
        int count = 0;
        float Average;
        int size1 = a.length;
        for (int i = 0; i < size1; i++) {
            count = count + a[i];

        }
        Average = count / size1;
        System.out.println("Average of number is: " + Average);

    }

}
