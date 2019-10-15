import java.util.ArrayList;
import java.util.Scanner;

public class Bits
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        int testCase = input.nextInt();

        ArrayList<Long> array = new  ArrayList<Long> ();
        ArrayList<String> first = new ArrayList<String>();
        ArrayList<Integer> result = new  ArrayList<Integer> ();
        long longInput;
        for(int index = 0; index < testCase; ++index) 
        {

            longInput = input.nextLong();
            array.add(longInput);
            int number_of_digits = (int)(Math.log10(longInput)); 
            long each_digit;
            int count = 0;
            int max = 0;
            for (int j = 0; j < number_of_digits+1; j++)
            {
                //find each digit
                each_digit = (int)(longInput / (int)(Math.pow(10, number_of_digits - j)));
                System.out.println(each_digit);
                first.add(Long.toBinaryString(each_digit));
                System.out.println(first.get(j));
                count = 0; 
                max = 0;
                for (int k = 0; k < first.get(j).length(); k++)
                {
                    if(first.get(j).charAt(k) == '1')
                    {
                        ++count;
                    }
                }
                System.out.println("count " + count);

                if(max < count)
                {
                    max = count;
                }

                System.out.println("max "+ max);
                
            }
            result.add(max);
        }
        //System.out.println(first);

        /*
      for(int index = 0; index < testCase; ++index)
      {
          int count = 0; 
          for(int index1 = 0; index1 < first.get(index).length(); ++index1)
          {
              if(first.get(index).charAt(index1) == '1')
              {
                  ++count;
              }
          }
          result.add(count);
      }
         */
        for(int index = 0; index < testCase-1; ++index)
        {
            System.out.println(result.get(index));
        }
        System.out.println(result.get(testCase-1));
    }

}
