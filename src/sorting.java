
public class sorting {

    static void sorting(int arr[], int n) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == 0) {
                count0++;
            }
            if (arr[i] == 1) {
                count1++;
            }
            if (arr[i] == 2) {
                count2++;
            }
        }

        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }

        for (int i = count0; i < count0 + count1; i++) {
            arr[i] = 1;
        }

        for (int i = count0 + count1; i < n; i++) {
            arr[i] = 2;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = { 0, 2, 2, 1, 1, 0, 1 };
        int n = arr.length;
        sorting(arr, n);
        System.out.println("sorting of array");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

}
