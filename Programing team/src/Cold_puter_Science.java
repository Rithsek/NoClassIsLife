import java.util.ArrayList;
import java.util.Scanner;
public class Cold_puter_Science
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int result = 0;
        for(int index = 0; index < num ; ++index)
        {
            if(sc.nextInt() < 0)
            {
                result += 1;
            }
        }
        System.out.print(result);

    }

}
