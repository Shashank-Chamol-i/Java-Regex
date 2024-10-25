import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Program Demonstration to show the implementation of Regular Expression*/
public class Program01 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[abc]");
        Matcher m = p.matcher("b");
        boolean b = m.matches();
        System.out.println(b);

        boolean b2 = Pattern.compile("[abc]").matcher("a").matches();
        System.out.println(b2);
    }
}
