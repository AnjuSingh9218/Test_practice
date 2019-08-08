import java.util.Arrays;

public class CylicallyRotate {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = { 10, 20, 30, 40 };

        int size = a[a.length - 1], i;
        for (i = a.length - 1; i > 0; i--)
            a[i] = a[i - 1];
        a[0] = size;
        System.out.println(Arrays.toString(a));
    }

}
