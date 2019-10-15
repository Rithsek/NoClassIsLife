import java.util.*;
/**
 * 
 */

/**
 * @author Rithsek
 *
 */
public class Server
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner inScanner = new Scanner(System.in);
        int number_of_queu = inScanner.nextInt();
        int space = inScanner.nextInt();
        int sum = 0;
        int each_input;
        int result = 0;
        for (int index = 0; index < number_of_queu; index++)
        {
            each_input = inScanner.nextInt();
            sum += each_input;
            if(sum <= space)
            {
                result++;
            }
        }
        System.out.print(result);

    }

}
