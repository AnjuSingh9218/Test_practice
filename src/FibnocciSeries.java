
public class FibnocciSeries {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 10, Sum, temp = 0, i = 1, temp2 = 1;
        while (i <= n) {
            System.out.println(temp);
            Sum = temp + temp2;
            temp = temp2;
            temp2 = Sum;

            i++;

        }
    }

}
