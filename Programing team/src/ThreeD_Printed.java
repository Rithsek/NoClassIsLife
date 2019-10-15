import java.util.*;
/**
 * 
 */

/**
 * @author Rithsek
 *
 */
public class ThreeD_Printed
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner inScanner = new Scanner(System.in);
        int num_of_status = inScanner.nextInt();
        int count = 1;
        for (int index = 0; index < num_of_status; index++)
        {
            int max =(int) Math.pow(2, index);
            
            if(max < num_of_status)
            {
                count++;
                
               
            }
            else {
                index = num_of_status;
            }
        }
        System.out.print(count);

    }

}
