import java.util.Scanner;

public class Bijele
{

    public static void main(String[] args)
    {
        
        int [] first = {1,1,2,2,2,8};
        int [] second = new int[6];
        
       Scanner input = new Scanner(System.in);
       
       int[] array = new int[6];
       for(int index = 0; index < 6; ++index)
       {
           array[index] = input.nextInt();
       }
       
       for(int index = 0; index < 6; ++index)
       {
           second[index] = first[index] - array[index];
       }
       
       for(int index = 0; index < 6; ++index)
       {
           System.out.print(second[index]+ " ");
       }

    }

}
