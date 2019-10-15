import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cetiri
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>();
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        array.add(first);
        array.add(second);
        array.add(third);
        Collections.sort(array);

        int fix = array.get(1) - array.get(0);
        int Fix = array.get(2) - array.get(1);

        if(fix == Fix)
        {
            System.out.print(array.get(2) + fix);
        }
        else if(fix > Fix)
        {
           System.out.print(array.get(1) - Fix);
        }
        else if(fix < Fix )
        {
            System.out.print(array.get(2) - fix);
        }


    }

}
