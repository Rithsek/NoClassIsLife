import java.util.ArrayList;
import java.util.Scanner;

public class ColdputerScience
{

    public static void main(String[] args)
    {
      
        Scanner input = new Scanner(System.in);
        int loop = input.nextInt();
        
        ArrayList<Integer> array = new ArrayList<Integer>();
        int count = 0;
        for(int index = 0 ; index < loop; ++index)
        {
            array.add(input.nextInt());
            if(array.get(index) < 0)
            {
                count++;
            }
        }
        System.out.print(count);
       
       
    }

}
