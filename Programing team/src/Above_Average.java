
import java.util.ArrayList;
import java.util.Scanner;

public class Above_Average
{

    public static void main(String[] args)
    {  
        
        Scanner input = new Scanner(System.in);
        int numberOf_testCase = input.nextInt();
        int array [];
        for(int i = 0; i < numberOf_testCase; ++i)
        {
            int number_Of_Integer_per_row = input.nextInt();
            double average = 0;
            array = new int[number_Of_Integer_per_row];
            double sum = 0;
            int count = 0;
            double result = 0.0;
            for(int j = 0; j < number_Of_Integer_per_row; ++j)
            {
                array[j] = input.nextInt();
                sum += array[j];
            }
            average = (double)sum / number_Of_Integer_per_row;
            for(int k = 0; k < number_Of_Integer_per_row; ++k)
            {
                if(array[k] > average)
                {
                    count++;
                }
            }
            result = (double)(count * 100) / number_Of_Integer_per_row;
            System.out.printf("%.3f%s%n", result , "%");
        }
    }

}


