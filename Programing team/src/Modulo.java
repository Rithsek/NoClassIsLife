import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Modulo
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int [] array = new int[10];
        
        for(int index = 0; index < 10; ++index)
        {
            array[index] = input.nextInt();
            
        }
        
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int index = 0; index < 10; ++index)
        {
            list.add(array[index] % 42);
        }
        int count = 1;
        ArrayList<Integer> Array = new ArrayList<Integer>();
        
        for(int index = 1; index < 10 ; ++index)
        {
          Array.add(list.get(index-1));
          if(!Array.contains((list.get(index))))
                  {
              ++count;
                  }
        }
       
        System.out.print(count);
        
      

    }

}
