/**
 * 
 */
import java.util.*;
/**
 * @author Rithsek
 *
 */
public class last_Factorial_digit
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner inScanner = new Scanner(System.in);
        int input = inScanner.nextInt();
        int outPut;
        for(int index = 0; index < input; ++index)
        {
            outPut = inScanner.nextInt();
            if(outPut < 3)
            {
                System.out.println(outPut);
            }
            else if(outPut == 3)
            {
                System.out.println(6);
            }
            else if(outPut == 4)
            {
                System.out.println(4);
            }
            else {
                System.out.println(0);
            }
        }

    }

}
