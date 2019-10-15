import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class ADifferentProblem
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<String>();
        ArrayList<Long> first = new ArrayList<Long>();
        ArrayList<Long> second = new ArrayList<Long>();

        while(input.hasNextLine())
        {
            String a = input.nextLine();
                if(a != null)
                {
                    array.add(a);
                }
                else
                {
                    break;
                }
          
        }
        System.out.print(array);
        input.close();
    }
}
