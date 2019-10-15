import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CryptographersConundrum
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        
        ArrayList<Character> array = new ArrayList<Character>();
        for(int index = 0; index < word.length(); ++index)
        {
            array.add(word.charAt(index));
        }
        int result = 0;
        for(int index = 0; index < word.length()-2; index = index +3)
        {
            
            if(array.get(index) != 'P')
            {
                ++result;
            }
            if(array.get(index+1) != 'E')
            {
                ++result;
            }
            if(array.get(index+2) != 'R')
            {
                ++result;
            }
            
        }
        
      
       System.out.print(result);
        
        

    }

}
