
public class duplicate_arraInt {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = { 3, 7, 9, 3, 7, 5 };
        int size1 = arr.length;
        for (int i = 0; i < size1; i++) {
            for (int j = i + 1; j < size1; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Element which is duplicate " + arr[i]);
                }
            }
        }

    }

}
