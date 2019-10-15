import java.util.Scanner;

public class Autori
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        String result = Character.toString(word.charAt(0));
        for(int index = 1; index < word.length(); ++index)
        {
          if(word.charAt(index) == '-')
          {
             result +=  Character.toString(word.charAt(index+1));
          }
        }
        System.out.print(result);

    }

}
