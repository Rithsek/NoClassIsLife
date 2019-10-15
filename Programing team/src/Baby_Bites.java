import java.util.*;
/**
 * 
 */

/**
 * @author Rithsek
 *
 */
public class Baby_Bites
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner inScanner = new Scanner(System.in);
        int line = inScanner.nextInt();
        String input;
        boolean result = false;
        for (int index = 1; index < line + 1; index++)
        { 
            input = inScanner.next();
            if(input.compareTo("mumble") == 0 || Integer.parseInt(input) == index)
            {
                result = true;
            }
            else {
                result = false;
                index = line + 2;
            }
        }
        if(result == true)
        {
            System.out.print("makes sense");
        }
        else 
        {
            System.out.print("something is fishy");
        }

    }

}
