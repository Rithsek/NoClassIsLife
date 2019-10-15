
/**
 * 
 */
import java.util.Scanner;

/**
 * @author Rithsek
 *
 */
public class Sibice
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner inScanner = new Scanner(System.in);
        int number_of_match = inScanner.nextInt();
        int width = inScanner.nextInt();
        int heigh = inScanner.nextInt();
        int lenght_of_match;
        String result[] = new String[number_of_match];
        for (int index = 0; index < number_of_match; index++)
        {
            lenght_of_match = inScanner.nextInt();
            if(Math.pow(lenght_of_match, 2) <= Math.pow(width, 2)+ Math.pow(heigh, 2))
            {
                //System.out.print("DA\n");
                result[index] = "DA";
            }
            else 
            {
                //System.out.print("NE\n");
                result[index] = "NE";
            }
        }
        for (int index = 0; index < result.length-1; index++)
        {
         System.out.println(result[index]);   
        }
        System.out.print(result[result.length-1]);

    }

}
