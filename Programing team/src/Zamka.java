import java.util.*;
/**
 * 
 */

/**
 * @author Rithsek
 *
 */
public class Zamka
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner inScanner = new Scanner(System.in);
        int l = inScanner.nextInt();
        int d = inScanner.nextInt();
        int x = inScanner.nextInt();
        for (int index =l; index <= d; index++)
        {
          
         if(digitsum(index) == x )
         {
             System.out.println((index));
             index = d;
         }
        }
        for (int index = d; index >= l; index--)
        {
            if(digitsum(index) == x)
            {
                System.out.print(index);
                index = l-1;
            }
        }
    }
    static int digitsum(int input)
    {
        int sum = 0;
        while(input > 0)
        {
            sum = sum + input %10;
            input = input /10;
        }
        return sum;
    }

}
