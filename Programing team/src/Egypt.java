import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Egypt
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<String> result = new ArrayList<String>();

        array.add(input.nextInt());
        array.add(input.nextInt());
        array.add(input.nextInt());
        while(input.nextInt() != 0)
        {

            if(array.get(0)*array.get(0) + array.get(1)*array.get(1) == array.get(2)*array.get(2))
            {
                result.add("right");
            }
            else
            {
                result.add("wrong");
            }
            array.clear();
            array.add(input.nextInt());
            array.add(input.nextInt());
            array.add(input.nextInt());
            if(array.get(2) == 0)
            {
                if(array.get(0)*array.get(0) + array.get(1)*array.get(1) == array.get(2)*array.get(2))
                {
                    result.add("right");
                }
                else
                {
                    result.add("wrong");
                }
            }
        }

        for(int index = 0 ; index < result.size() ; index++)
        {
            System.out.println(result.get(index));
        }

    }

}
