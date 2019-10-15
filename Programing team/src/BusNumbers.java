import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BusNumbers
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int testCase = input.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<String> result = new ArrayList<String>();
        
        for(int index = 0; index < testCase; ++index)
        {
            array.add(input.nextInt());
        }
       Collections.sort(array);
       System.out.println(array);
       int count = 1;
       
       for(int index = 0; index < array.size()-1; ++index)
       {
           int start = 0;
           if((array.get(index+2) - array.get(index) == 1))
           {
              count = 3;
              start = index;
           }
       }
       System.out.print(result);

    }

}
