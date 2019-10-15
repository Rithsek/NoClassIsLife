import java.util.*;
/**
 * 
 */

/**
 * @author Rithsek
 *
 */
public class bestCompressionEver
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner inScanner = new Scanner(System.in);
        long file = inScanner.nextLong();
        int file_Size = inScanner.nextInt();
        String binary = Integer.toBinaryString((int)file);
        if(binary.length() > file_Size || binary.length() == file_Size)
        {
            System.out.print("yes");
        }
        else {
            System.out.print("no");
        }
        }
        

}
