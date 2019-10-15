import java.util.ArrayList;
import java.util.Scanner;

public class IhaveBeenEverywhereMan
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();

        int [] first = new int[testCase];
        //  ArrayList<String> second = new ArrayList<String>();
        int [] result = new int[testCase];

        for(int index = 0; index < testCase; ++index)
        {
           
            ArrayList<String> second =  new ArrayList<String>();
            first[index] = input.nextInt();
            for(int index1 = 0; index1 < first[index]; ++index1)
            {
                second.add(input.next());
            }

            ArrayList<String> Array = new ArrayList<String>();
            int count = 1;

            for(int index2 = 1; index2 < first[index] ; ++index2)
            {
                Array.add(second.get(index2-1));
                if(!Array.contains((second.get(index2))))
                {
                    ++count;
                }

            }
            result[index] = count;
            Array.clear();
            second.clear();
        }
        for(int index = 0; index < testCase; ++index)
        {
            System.out.println(result[index]);
        }


    }

}
