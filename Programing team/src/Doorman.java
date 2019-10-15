import java.util.Scanner;

public class Doorman
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int different = input.nextInt();
        String word = input.next();
        
        int m = 0;
        int w = 0;
       for(int index = 0; index < word.length(); ++index)
       {
           if(word.charAt(index) == 'M')
           {
               ++m;
           }
           else if(word.charAt(index) == 'W')
           {
               ++w;
           }
       }
       System.out.println(m);
       System.out.println(w);
    }

}
