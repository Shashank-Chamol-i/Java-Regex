import java.util.regex.Pattern;

/*AlphaNumeric character */
public class Program03 {
    public static void main(String[] args) {
        boolean b = Pattern.compile("[a-zA-z\\d]{6}").matcher("Pring5").matches();
        System.out.println(b);
    }
}
