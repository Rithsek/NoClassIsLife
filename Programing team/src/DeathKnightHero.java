import java.util.ArrayList;
import java.util.Scanner;

public class DeathKnightHero
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int testCase = input.nextInt();
        
        ArrayList<Character> array = new ArrayList<Character>();
        
        int result = 0;
        for(int index = 0; index < testCase; ++index)
        {
            String word = input.next();
            for(int index1 = 0; index1 < word.length(); ++index1)
            {
               array.add(word.charAt(index1));
            }
            for(int index2 = 0; index2 < word.length()-2; ++index2)
            {
                if(array.get(index2) == 'D' && ((array.get(index2+1) == 'O' && array.get(index2+2) == 'C') 
                       || (array.get(index2+1) == 'C' && array.get(index2+2) == 'O')))
                {
                    ++result;
                }
            }
            array.clear();
        }
        System.out.print(result);
    }

}
