/**
 * 
 */
import java.util.Scanner; 
/**
 * @author Rithsek
 *
 */
public class Skocimis
{

    

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int  first_move = B-A-1;
        int second_move = C-B-1;
        int final_move = Math.max(first_move, second_move);
        System.out.print(final_move);

    }

}
