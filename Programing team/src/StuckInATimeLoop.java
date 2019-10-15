import java.util.Scanner;

public class StuckInATimeLoop
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int loop = input.nextInt();
        
        for(int index = 1; index <= loop-1; ++index)
        {
            System.out.println(index + " Abracadabra");
        }
        System.out.print(loop + " Abracadabra");
    }

}
