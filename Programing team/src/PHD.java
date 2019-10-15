import java.util.ArrayList;
import java.util.Scanner;

public class PHD
{

    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       int first = input.nextInt();
       ArrayList<String> second = new ArrayList<String> ();
       ArrayList<String> third = new ArrayList<String> ();
       
       
       for(int index = 0 ; index < first; ++index)
       {
           second.add(input.next());
           if(second.get(index).equals("P=NP"))
           {
               third.add("skipped");
           }
           else
           {
               String A = second.get(index).substring(0, 1);
               String B = second.get(index).substring(2);
               int result = Integer.parseInt(A) + Integer.parseInt(B);
               third.add(Integer.toString(result));
           }
           System.out.println(third.get(index));
       }
       
       
       
           
       

    }

}
