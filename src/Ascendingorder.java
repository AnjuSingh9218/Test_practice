
public class Ascendingorder {

    static void Ascending(int arr[], int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = { 876, 865, 346, 567, 8 };
        int n = arr.length;
        int number;
        System.out.println(+n);
        int Average = 0;
        int sum = 0;
        Ascending(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");

        }
        System.out.println();

        for (int i = 1; i < n - 1; i++) {
            System.out.println(+arr[i]);
            sum = sum + arr[i];

        }
        System.out.println(+sum);
        number = n - 2;
        Average = sum / number;
        System.out.println("Average of Array : " + Average);
    }

}
