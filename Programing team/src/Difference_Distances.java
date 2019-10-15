import java.util.Scanner;

/**
 * 
 */

/**
 * @author Rithsek
 *
 */
public class Difference_Distances
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner inScanner = new Scanner(System.in);
        double x1 = inScanner.nextDouble();
        while(x1 != 0)
        {
            double y1 = inScanner.nextDouble();
            double x2 = inScanner.nextDouble();
            double y2 = inScanner.nextDouble();
            double p = inScanner.nextDouble();
            double result = Math.pow((Math.pow(Math.abs(x1-x2), p)+Math.pow(Math.abs(y1-y2), p)), 1/p);
            System.out.printf("%.4f", result);
            System.out.println();
            x1 = inScanner.nextDouble();
        }
    }
}




