
public class Test1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // 10,20,-100,101,102-109,110,120,-200 ,201,203-209,210,220,
        int n = 1000, count = 0;

        for (int i = 0; i < n; i++) {

            System.out.println(i);
            i = i + 9;
            count = count + 1;
            if (count == 100) {
                System.out.println(i);
                i = i + 1;
            }
        }
    }

}
