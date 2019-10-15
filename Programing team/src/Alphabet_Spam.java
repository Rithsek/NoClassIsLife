import java.util.*;
/**
 * 
 */

import javax.net.ssl.SNIHostName;

/**
 * @author Rithsek
 *
 */
public class Alphabet_Spam
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner inScanner = new Scanner(System.in);
        String inputString = inScanner.next();
        ArrayList<Character> upper_caseArrayList = new ArrayList<>();
        ArrayList<Character> lower_caseArrayList = new ArrayList<>();
        ArrayList<Character> underscoreArrayList = new ArrayList<>();
        for (char index = 'A'; index <= 'Z'; index++)
        {
            upper_caseArrayList.add(index);
            lower_caseArrayList.add(Character.toLowerCase(index));
        }
        int upper = 0;
        int lower = 0;
        int space = 0;
        int symbol = 0;
                
        for (int index = 0; index < inputString.length(); index++)
        {
            if (upper_caseArrayList.contains(inputString.charAt(index)))
            {
                upper++;
            }
            else if(lower_caseArrayList.contains(inputString.charAt(index)))
            {
                lower++;
            }
            else if ('_' == inputString.charAt(index)) {
                space ++;
            }
            else {
                symbol++;
            }
        }
       double first = (double) space/inputString.length();
       double second = (double) lower/inputString.length();
       double third = (double) upper/inputString.length();
       double fourth = (double) symbol/inputString.length();
       System.out.printf("%.6f\n", first);
       System.out.printf("%.6f\n", second);
       System.out.printf("%.6f\n", third);
       System.out.printf("%.6f", fourth);

    }

}
