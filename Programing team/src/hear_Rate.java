import java.util.*;
/**
 * 
 */

/**
 * @author Rithsek
 *
 */
public class hear_Rate
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner inScanner = new Scanner(System.in);
        int line = inScanner.nextInt();
        for (int index = 0; index < line; index++)
        {
         int b = inScanner.nextInt();
         double p = inScanner.nextDouble();
         double x = 60/p;
         double xb = x*b;
         //System.out.printf("%.4f ",x);
         System.out.printf("%.4f %.4f %.4f\n", xb-x, xb, xb+x);
        }

    }

}
