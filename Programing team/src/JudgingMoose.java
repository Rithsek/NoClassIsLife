import java.util.Scanner;

public class JudgingMoose
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int left = input.nextInt();
        int right = input.nextInt();
        
        if(left ==0 & right == 0)
        {
            System.out.print("Not a moose");
        }
        else if( left == right)
        {
            System.out.print("Even "+ 2*right);
        }
        else 
        {
            System.out.print("Odd "+ 2*Math.max(left, right));
        }
                    

    }

}
