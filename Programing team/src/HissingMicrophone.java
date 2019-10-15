import java.util.Scanner;

public class HissingMicrophone
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        boolean found = false;
        for(int index = 0; index < word.length()-1; ++index)
        {
            if(word.charAt(index) == 's' &&word.charAt(index+1) == 's' )
            {
                found = true;
            }
        }
        if(found)
        {
            System.out.print("hiss");
        }
        else
        {
            System.out.print("no hiss");
        }

    }

}

