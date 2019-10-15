import java.util.*;
/**
 * 
 */

/**
 * @author Rithsek
 *
 */
public class Tarifa
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner inScanner = new Scanner(System.in);
        int x = inScanner.nextInt();
        int number_month = inScanner.nextInt();
        int input;
        int sum = 0;
        for (int index = 0; index < number_month; index++)
        {
            input = inScanner.nextInt();
            sum = sum + (x-input);
        }
        System.out.print(sum + x);
    }

}
