/*Regex finder*/
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the regex");
        Pattern p = Pattern.compile(sc.nextLine());
        System.out.println("Enter the mathcer");
        Matcher m = p.matcher(sc.nextLine());
        boolean found = false;
        while(m.find())
        {
            System.out.println("Name of the Pattern :" + m.group()+ " Startind index : "+m.start()+" Ending index : "+ m.end());
            found = true;
        }
        if(!found){
            System.out.println("NO element found :");
        }

    }
}
