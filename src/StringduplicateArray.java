
public class StringduplicateArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String arr[] = { "anju", "singh", "Sushant", "anju", "sourabh", "Sushant" };
        int size1 = arr.length;
        for (int i = 0; i < size1; i++) {
            for (int j = i + 1; j < size1; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println("Strings which are duplicate is " + arr[i]);
                }
            }
        }

    }

}
