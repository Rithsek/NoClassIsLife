import java.util.ArrayList;
import java.util.Scanner;

public class NastyHacks
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int line = input.nextInt();
        
        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<String> result = new ArrayList<String>();

        for(int index = 0; index < line; ++index)
        {
            for(int index1 = 0; index1 < 3; ++index1)
            {
                array.add(input.nextInt());
            }
            if(array.get(0) > array.get(1) - array.get(2))
            {
                result.add("do not advertise");
            }
            else if(array.get(0) < array.get(1) - array.get(2))
            {
                result.add("advertise");
            }
            else if(array.get(0) == array.get(1) - array.get(2))
            {
                result.add("does not matter");
            }
            array.clear();
        }
        for(int index = 0; index < line; ++index)
        {
            System.out.println(result.get(index));
        }
                    
    }

}
