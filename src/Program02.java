import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program02 {
    public static void main(String[] args) {
        boolean b = Pattern.compile("\\d").matcher("8").matches();
        System.out.println(b);
    }
}
