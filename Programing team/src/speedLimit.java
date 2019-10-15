
/**
 * 
 */
import java.util.Scanner;

/**
 * @author Rithsek
 *
 */
public class speedLimit
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner inScanner = new Scanner(System.in);
        int input = inScanner.nextInt();
        while(input != -1)
        {
            int speed;
            int hour;
            int temp = 0;
            int sum = 0;
            for (int index = 0; index < input; index++)
            {
                speed = inScanner.nextInt();
                hour = inScanner.nextInt();
                sum += speed*(hour-temp);
                temp = hour;
            }
            System.out.printf("%d%s\n", sum, " miles");
            //System.out.println();
            input = inScanner.nextInt();
        }
    }

}
