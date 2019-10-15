import java.util.ArrayList;
import java.util.Scanner;

public class Kemija
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        ArrayList<Character> array = new ArrayList<Character>();
        ArrayList<Character> Array = new ArrayList<Character>();
        Array.add('a');
        Array.add('e');
        Array.add('i');
        Array.add('o');
        Array.add('u');
        for(int index = 0; index < word.length(); ++index)
        {
            array.add(word.charAt(index));
        }
        for(int index = 0; index < array.size()-2; ++index)
        {
            if((array.get(index) == 'a'&&array.get(index+1) == 'p' &&array.get(index+2) == 'a')
                    ||(array.get(index) == 'e'&&array.get(index+1) == 'p' &&array.get(index+2) == 'e')
                    ||(array.get(index) == 'i'&&array.get(index+1) == 'p' &&array.get(index+2) == 'i')
                    ||(array.get(index) == 'o'&&array.get(index+1) == 'p' &&array.get(index+2) == 'o')
                    ||(array.get(index) == 'u'&&array.get(index+1) == 'p' &&array.get(index+2) == 'u'))
            {
                array.remove(index+1);
                array.remove(index+1);
               // index = index-1; 
            }
        }
        for(int index = 0; index < array.size(); ++index)
        {
            System.out.print(array.get(index)); 
        }          
    }

}
