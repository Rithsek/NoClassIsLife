import java.util.Scanner;

public class R2
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int R1 = input.nextInt();
        int S = input.nextInt();
        int R2;
        R2 = 2*S - R1;
        
        System.out.print(R2);

    }

}
