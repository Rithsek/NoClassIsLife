/**
 * 
 */
import java.util.Scanner;
/**
 * @author Rithsek
 * @version 21/09/19
 */
public class QALY
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       int number_of_period = input.nextInt();
       double quality; 
       double year;
       double accumulative = 0.0;
       for(int index = 0; index < number_of_period; ++index)
       {
           quality = input.nextDouble();
           year = input.nextDouble();
           //System.out.print(quality);
           accumulative = accumulative + quality * year;
       }
       System.out.printf("%.3f%n", accumulative);
    }

}
