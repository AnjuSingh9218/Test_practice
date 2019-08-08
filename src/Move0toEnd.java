
public class Move0toEnd {
    public void pushtoZero(int a[], int n) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != 0) {
                a[count++] = a[i];

            }

        }
        while (count < n) {
            a[count++] = 0;
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = { 1, 2, 0, 6, 8, 0, 4, 0, 0 };
        int n = a.length;
        Move0toEnd obj = new Move0toEnd();
        obj.pushtoZero(a, n);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

    }
}