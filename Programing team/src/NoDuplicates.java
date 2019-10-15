import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NoDuplicates
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        ArrayList<String> array = new ArrayList<String>();
        
        
       //String word = input.nextLine();
        boolean found = true;
       while(found)
       { 
           String word = input.nextLine();
           if(word == null)
           {
               found = false;
           }
          
           array.add(input.next());
           System.out.print(array); 
           for(int index = 0; index < array.size(); ++index)
           {
               if(Collections.frequency(array, array.get(index)) >=2)
               {
                   found = true;
               }
           }
           if(found)
           {
               System.out.print("no");
           }
           else
           {
               System.out.print("yes");
           }
           
       }
       
       String word = input.nextLine();
       int start = 0;
       for(int index = 0; index < word.length(); ++index)
       {
          
           if(word.charAt(index) == ' ')
           {
               array.add(word.substring(start, index));
               
               start = index;
           }
       }
       
       //System.out.println(word);
       //System.out.println(array);
       

    }

}
