
public class OddorEven {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = { 2, 3, 4, 7, 8, 9 };
        int size = arr.length;
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                count = count + 1;
            } else {
                count1 = count1 + 1;
            }

        }
        System.out.println("Total number of Even number : " + count);
        System.out.println("Total number of odd number : " + count1);
    }

}
