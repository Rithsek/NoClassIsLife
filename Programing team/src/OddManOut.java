import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OddManOut
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        ArrayList<String> resutl = new ArrayList<String>();
        ArrayList<Integer> array = new ArrayList<Integer>();
        int testCase = input.nextInt();
        
        for(int index = 1; index < testCase+1; ++index)
        {
            int guest = input.nextInt();
            for(int index1 = 0; index1 < guest; ++index1)
            {
                array.add(input.nextInt());
            }
            for(int index1 = 0; index1 < guest; ++index1)
            {
               if(Collections.frequency(array, array.get(index1)) == 1)
               {
                   System.out.println("Case #"+ index+": "+array.get(index1));
               }
               
            }
            array.clear();
            
        }

    }

}
