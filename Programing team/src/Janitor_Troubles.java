import java.util.*;
/**
 * 
 */

/**
 * @author Rithsek
 *
 */
public class Janitor_Troubles
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner inScanner = new Scanner(System.in);
        int a = inScanner.nextInt();
        int b = inScanner.nextInt();
        int c = inScanner.nextInt();
        int d = inScanner.nextInt();
        double s = (double)(a+b+c+d)/2;
        double area = Math.sqrt((s-a)*(s-b)*(s-c)*(s-d));
        System.out.printf("%.6f", area);

    }

}
