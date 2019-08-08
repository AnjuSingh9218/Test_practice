import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matcher {

    public boolean matching(String str) {
        String Value = "(X)";

        Pattern p = Pattern.compile(Value);
        Matcher m = p.matcher(str);
        return m.matches();

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = new String("My name is Anju");
        matcher obj = new matcher();
        obj.matching(str);
        System.out.println("he is dead");

    }

}
