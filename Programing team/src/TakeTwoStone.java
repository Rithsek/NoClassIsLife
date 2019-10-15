import java.util.Scanner;

public class TakeTwoStone
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int stone = input.nextInt();
        if(stone % 2 == 0)
        {
            System.out.print("Bob");
        }
        else
        {
            System.out.print("Alice");
        }

    }

}
