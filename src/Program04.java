import java.util.regex.Pattern;

/*Create a pattern which input 10 digits number starting only with 7 8 9 */
public class Program04 {
    public static void main(String[] args) {
        boolean b = Pattern.compile("[789]{1}[\\d]{9}").matcher("7894561230").matches();
        System.out.println(b);

    }
}
