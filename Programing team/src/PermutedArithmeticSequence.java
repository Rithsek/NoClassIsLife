import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PermutedArithmeticSequence
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int testCase = input.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int index = 0; index < testCase; ++index)
        {
            int length = input.nextInt();
            for(int index1 = 0; index1 < length; ++index1)
            {
                array.add(input.nextInt());
            }

            int diff = array.get(1) - array.get(0);
            boolean found = false;
            for(int index1 = 1; index1 < length-1; ++index1)
            {
                if( array.get(index1+1) - array.get(index1) == diff)
                {
                    found = true;
                }
                else
                {
                    found = false;
                    index1 = length;
                }
               
            }
            if(found == true)
            {
                System.out.println("arithmetic");
                array.clear();
            }
            else
            {

                Collections.sort(array);

                int different = array.get(1) - array.get(0);

                boolean yes = false;
                for(int index2 = 1; index2 < length-1; ++index2)
                {
                    if(array.get(index2+1) - array.get(index2) == different)
                    {
                        yes = true;
                    }
                    else
                    {
                        yes = false;
                        index2 = length;
                    }
                }
                if(yes)
                {
                    System.out.println("permuted arithmetic");
                    array.clear();
                }
                else
                {
                    System.out.println("non-arithmetic");
                    array.clear();
                }
            }
        }

    }

}


