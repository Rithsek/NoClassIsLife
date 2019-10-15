import java.util.ArrayList;
import java.util.Scanner;

public class BatterUp
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int line = input.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>();

        double result = 0;
        int count = 0;
        for(int index = 0; index < line; ++index)
        {
            array.add(input.nextInt());
            if(array.get(index) >=0)
            {
                ++count;
                result +=array.get(index);
            }
        }
        result = result/count;
        System.out.print(result);
    }

}
