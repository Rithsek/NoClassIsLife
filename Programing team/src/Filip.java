import java.util.Scanner;

public class Filip
{

    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       
       int A = input.nextInt();
       int B = input.nextInt();
       
       int Max = Math.max(A, B);
      String word =  Integer.toString(Max);
       for(int index = 2; index >= 0; --index)
       {
          System.out.print(word.charAt(index));
       }
       
      
       
    }

}
