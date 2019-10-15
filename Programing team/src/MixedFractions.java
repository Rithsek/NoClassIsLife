import java.util.ArrayList;
import java.util.Scanner;

public class MixedFractions
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        ArrayList<String> array = new ArrayList<String>();
        
        
        boolean found = true;
        while(found )
        {
            int first = input.nextInt();
            int second = input.nextInt();
            if(first == 0 && second ==0) 
            {
                found = false;
            }
            else
            {
                if(first < second)
                {
                    System.out.println(0+" "+first+" / "+ second);
                }
                else
                {
                    int q = first/second;
                    int r = first - (q*second);
                    System.out.println(q+" "+r+" / "+ second);
                }
               // array.add(first);
               // array.add(second);
            }  
        } 
       // array.add(Integer.toString(0)+" "+Integer.toString(first)+" / "+ Integer.toString(second));
    }
}
