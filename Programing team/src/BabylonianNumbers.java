import java.util.ArrayList;
import java.util.Scanner;

public class BabylonianNumbers
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int testCase = input.nextInt();
        ArrayList<Character> array = new ArrayList<Character>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        int count = 0;
        for(int index = 0; index < testCase; ++index )
        {
            String word = input.next();
            
            int counter = 0;
            for( index = word.length()-1; index >= 0; --index)
            {
               if(word.charAt(index) == ',')
               {   
                   int i = word.length()-1;
                   count += Integer.parseInt(word.substring(i, index))*Math.pow(60, counter);
                   counter++;
               }
               
            }
        }
        System.out.println(count);
    }

}
