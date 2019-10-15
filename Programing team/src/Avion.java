import java.util.Scanner;
/**
 * 
 */

/**
 * @author Rithsek
 *
 */
public class Avion
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner inScanner = new Scanner((System.in));
        String inputString;
        int count = 0;
        for (int index = 0; index < 5; index++)
        {
            inputString = inScanner.nextLine();
            if(inputString.contains("FBI"))
            {
                System.out.print(index+1 + " ");
                count++;
            }
        }
        if (count == 0)
        {
            System.out.print("HE GOT AWAY!");
        }

    }

}
