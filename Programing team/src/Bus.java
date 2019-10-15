import java.util.Scanner;

public class Bus
{

    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       
       int numberOfCase = input.nextInt();
       double [] array = new double[numberOfCase];
       int [] result = new int[numberOfCase];
       
       for(int index = 0; index < numberOfCase; ++index)
       {
           array[index] = input.nextInt();
       }
       
       for(int index = 0 ;index< numberOfCase; ++index)
       {
           result[index] =(int) Math.pow(2,array[index] )-1;
       }
       for(int index = 0; index < numberOfCase; ++index)
       {
           System.out.println(result[index]);
       }
               

    }

}
