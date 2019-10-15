import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Karte
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        ArrayList<String> array = new ArrayList<String>();
        ArrayList<Character> Array = new ArrayList<Character>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int index = 0; index < word.length(); ++index)
        {
            array.add(word.substring(index, index+3));
            Array.add(word.charAt(index));
            index += 2;
        }   
        for(int index = 0; index < Array.size();  ++index)
        {
            String xx = "";
            {
                int count = 1;
                for(int i = index+1; i < Array.size(); ++i)
                {
                    if(Collections.frequency(array, array.get(i)) == 2)
                    {
                        xx = "GRESKA";
                        System.out.print("GRESKA");
                        i = Array.size();
                        index = Array.size();
                        break;
                    }
                    else if(Array.get(index) == Array.get(i))
                    {
                        ++count;
                        Array.remove(i);
                        Array.add(i, 'o');
                    }  
                } 
                if(!xx.equals("GRESKA"))
                {
                    if(Array.get(index) == 'o')
                    {
                        result.add(13);
                    }
                    else
                    {
                        result.add(13 - count);
                    }
                    System.out.print(result.get(index)+" ");
                }
                
            }
        }
    }
}
