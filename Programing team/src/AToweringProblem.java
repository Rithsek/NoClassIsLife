import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AToweringProblem
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int index = 0; index < 6; ++index)
        {
            array.add(input.nextInt());
        }
        int firstTower = input.nextInt();
        int secondTower = input.nextInt();
        
        ArrayList<Integer> firstBoxs = new ArrayList<Integer>();
        ArrayList<Integer> secondBoxs = new ArrayList<Integer>();
        
        for(int index = 0; index < 6 ; ++index)
        {
            for(int index1 = 1; index1 < index; ++index1)
            {
                for(int index2 = 0; index2 < index1 ; ++index2)

                {
                    if(array.get(index) + array.get(index1)+array.get(index2) == firstTower )
                    {
                        firstBoxs.add(array.get(index));
                        firstBoxs.add(array.get(index1));
                        firstBoxs.add(array.get(index2));
                    } 
                }
            }
        }
        for(int index = 0; index < 6; ++index)
        {
            if(!firstBoxs.contains(array.get(index)))
            {
                secondBoxs.add(array.get(index));
            }
        }
        Collections.sort(firstBoxs);
        Collections.sort(secondBoxs);
       for(int index = 2; index >= 0; --index)
       {
           System.out.print(firstBoxs.get(index)+ " ");
       }
       for(int index = 2; index >=1; --index)
       {
           System.out.print(secondBoxs.get(index)+ " ");
       }
       System.out.print(secondBoxs.get(0));

    }

}
