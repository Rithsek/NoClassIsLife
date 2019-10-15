import java.util.ArrayList;
import java.util.Scanner;

public class testClass
{

    public static void main(String[] args)
    {
        Scanner inScanner = new Scanner(System.in);
        String line = inScanner.nextLine();
        while(line.compareTo("") !=0)
        {
            System.out.println(line);
            line = inScanner.nextLine();
        }
    }

}
