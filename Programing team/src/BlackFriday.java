import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BlackFriday
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();

        ArrayList<Integer> array = new ArrayList<Integer>();

        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int index = 0; index < size; ++index)
        {
            array.add(input.nextInt());
        }

        int value;

        for(int index = 0; index < size; ++index)
        {
            if(Collections.frequency(array, array.get(index)) == 1)
            {
                result.add(array.get(index));

            }


        }
        if(result.size() == 0)
        {
            System.out.print("none");
        }
        else
        {
            int max = Collections.max(result);
            value = array.indexOf(max)+1;
            System.out.print(value);
        }





    }

}
