
public class LivespaceQuestion {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = { 12, 9, 10, 8, 3, 4, 5 };
        int size = a.length;
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (a[i] < a[j]) {
                    a[i] = a[j];
                } else {
                    a[i] = a[i];

                }
            }
            System.out.println(+a[i]);
        }

    }

}
