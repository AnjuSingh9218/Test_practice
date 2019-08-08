
public class RotationtoSorted {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = { 1, 8, 5, 0, 6, 9 };
        int size = a.length;
        int min = a[0];
        int minindex = -1;
        for (int i = 1; i < size; i++) {
            if (min > a[i]) {
                min = a[i];
                minindex = i;

            }
        }
        System.out.println(minindex);
    }

}
