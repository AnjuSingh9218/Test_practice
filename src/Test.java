
public class Test {

    static void pushZerotofront(int arr[], int n) {

        int count = 0;
        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] != 1) {
                arr[count++] = arr[i];
            }

        }
        while (count < n) {
            arr[count++] = 1;
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = { 1, 0, 5, 1, 0, 0, 1, 5, 6, 7 };
        int n = arr.length;
        Test a = new Test();
        a.pushZerotofront(arr, n);
        System.out.println("array after pushing zero to front");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}
