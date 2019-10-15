import java.util.ArrayList;
import java.util.Scanner;

public class Pet
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>();
        
        for(int index = 0; index < 5; ++index)
        {
            int sum = 0;
            for(int index1 = 0; index1 < 4; ++index1)
            {
                int grade = input.nextInt();
                sum += grade;
                
            }
            array.add(sum);
        }
        int max = array.get(0);
        for(int index = 1; index < 5; ++index)
        {
         if(array.get(index) > max)
         {
             max = array.get(index);
         }
        }
        int index = array.indexOf(max);
        System.out.print(index+1 + " "+ max);
    }

}
