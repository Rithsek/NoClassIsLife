import java.util.Scanner;
/**
 * 
 */

/**
 * @author Rithsek
 *
 */
public class Solving_for_carrot
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner inputScanner = new Scanner(System.in);
        int number_of_contestant = inputScanner.nextInt();
        int number_of_problem_solved = inputScanner.nextInt();
        int result = 0;
        String huffle_puff;
        for(int index = 0; index < number_of_contestant; ++index)
        {
            huffle_puff = inputScanner.next();
            if(huffle_puff.compareTo("carrots?") != 0 )
            {
                result ++;
            }
        }
        System.out.print(number_of_problem_solved);

    }

}
