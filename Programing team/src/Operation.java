import java.util.ArrayList;
import java.util.Scanner;

public class Operation
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        ArrayList<String> array = new ArrayList<String>();
        
       for(int index = 0; index < line.length(); ++index)
       {
           array.add(Character.toString(line.charAt(index)));
       }
        System.out.print(array);
    }

}
