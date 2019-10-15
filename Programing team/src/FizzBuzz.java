import java.util.Scanner;

public class FizzBuzz
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int N = input.nextInt();
        
        for(int index = 1; index <= N ; ++index)
        {
            if(index % x == 0 && index % y == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if(index % x == 0)
            {
                System.out.println("Fizz");
            }
            else if(index % y == 0)
            {
                System.out.println("Buzz");
            }
            
            else
            {
                System.out.println(index);
            }
        }

    }

}
