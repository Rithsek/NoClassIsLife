import java.util.Scanner;

public class Palindrome
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        boolean length = false;


        for(int index = 0; index < word.length()/2; ++index)
        {
            if(word.charAt(index) == word.charAt(word.length()-index-1))
            {
                length = true;
            }
        }

        if(length)
        {
            System.out.print("The word is Palindrome");
        }
        else
        {
            System.out.print("The word is ! Palindrome");
        }

    }

}
