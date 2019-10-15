
import java.util.Scanner;

public class Backspace
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String word = input.next(); 
        char[] array = word.toCharArray();
        int count = 0;
        for (int i = array.length-1; i >=0; i--)
        {
            if(array[i] == '<')
            {
                array[i] = ' ';
                count++;
            }
            else if(count > 0)
            {
                array[i] = ' ';
                count--;
            }
        }
        word = new String(array);
        System.out.print(word.replaceAll(" ", ""));
    }


}
