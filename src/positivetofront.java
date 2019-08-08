import java.util.ArrayList;
import java.util.List;

public class positivetofront {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = { 7, -3, 2, -5, 6, 10 };
        List<Integer> positive = new ArrayList<Integer>();
        List<Integer> negative = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {

                positive.add(a[i]);
            } else {
                negative.add(a[i]);
            }
        }
        /*
         * for (int i : a) { if (i > 0) { positive.add(i);
         * 
         * } else { negative.add(i); } }
         */
        List<Integer> Result = new ArrayList<Integer>();
        Result.addAll(positive);
        Result.addAll(negative);
        System.out.println(Result);

    }

}
