import java.util.ArrayList;
import java.util.Scanner;

public class Oddities
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int loop = input.nextInt();
        
        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<String> result = new ArrayList<String>();
        
       for(int index = 0; index < loop; ++index)
       {
           array.add(input.nextInt());
       }
        
        for(int index = 0; index < loop; ++index)
        {
            if(array.get(index) % 2 == 0)
            {
              result.add(Integer.toString(array.get(index))+ " is even");
            }
            else
            {
                result.add(Integer.toString(array.get(index))+ " is odd");
            }
        }
        
        for(int index = 0; index < loop; ++index)
        {
            System.out.println(result.get(index));
        }
    }

}
