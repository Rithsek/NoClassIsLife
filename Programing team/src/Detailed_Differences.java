import java.util.*;
/**
 * 
 */

/**
 * @author Rithsek
 *
 */
public class Detailed_Differences
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner inScanner = new Scanner(System.in);
        int line = inScanner.nextInt();
        for (int index = 0; index <line; index++)
        {
            String firString = inScanner.next();
            String secondString = inScanner.next();
            String resultString = "";
            System.out.println(firString);
            System.out.println(secondString);
            for (int i = 0; i <firString.length(); i++)
            {

                if(firString.charAt(i) == secondString.charAt(i))
                {
                    resultString += '.';
                }
                else {
                    resultString += '*';
                }
            }
            System.out.println(resultString);

        }

    }

}
