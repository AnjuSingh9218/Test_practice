
public class rearranging {

    static void rearrange(int arr[], int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    arr[i] = arr[i];
                } else {

                    arr[i] = arr[j];
                }
            }
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = { 2, 9, 5, 8, 6, 3 };
        int n = arr.length;
        rearrange(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

    }

}
