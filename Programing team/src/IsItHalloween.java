import java.util.*;/**
 * 
 */

/**
 * @author Rithsek
 *
 */
public class IsItHalloween
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner iScanner = new Scanner(System.in);
        String monthString = iScanner.next();
        int date = iScanner.nextInt();
        if(monthString.contains("OCT") && date == 31 || monthString.contains("DEC") && date == 25)
        {
            System.out.print("yup");
        }
        else {
            System.out.print("nope");
        }

    }

}
