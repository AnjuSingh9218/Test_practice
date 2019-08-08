
public class sumofall10 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = { 10, 9, 8, 7, 10, 10, 10, 8 };
        int sum = 0;
        int size = a.length;
        for (int i = 0; i < size; i++) {
            if (a[i] == 10) {
                sum = sum + a[i];
            }
        }

        System.out.println(+sum);
    }

}