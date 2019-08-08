import java.util.ArrayList;
import java.util.List;

public class separateodd_andEven {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a[] = { 0, 0, 1, 1, 0, 1, 1, 0 };
        int n = a.length;
        List<Integer> even = new ArrayList<Integer>();
        List<Integer> odd = new ArrayList<Integer>();
        for (int i : a) {
            if (i == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }
        }

        List<Integer> Result = new ArrayList<Integer>();
        Result.addAll(even);
        Result.addAll(odd);
        System.out.println(Result);
    }

}
