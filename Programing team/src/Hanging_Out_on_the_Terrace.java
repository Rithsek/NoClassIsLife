import java.util.*;
/**
 * 
 */

/**
 * @author Rithsek
 *
 */
public class Hanging_Out_on_the_Terrace
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner inScanner = new Scanner(System.in);
        int max_people = inScanner.nextInt();
        int num_of_group = inScanner.nextInt();
        int count = 0;
        int total_num_people = 0;
      int temp =0;
        for (int index = 0; index < num_of_group; index++)
        {
            String enter_or_leaveString = inScanner.next();
            int num_of_people = inScanner.nextInt();
            if(enter_or_leaveString.equals("enter"))
            {
                temp += num_of_people;
                if(temp <= max_people)
                {
                    total_num_people += num_of_people;   
                }
                else {
                   count++;
                }
            }
            else {
                total_num_people -= num_of_people;
            }
          temp = total_num_people;
        }
        System.out.print(count);

    }

}
