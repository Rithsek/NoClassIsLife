import java.util.Scanner;

public class Apaxiaaaaaaaaaaaans
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        
        for(int index = 0; index < word.length()-1; ++index)
        {
            if(word.charAt(index) == word.charAt(index+1))
            {
                word = deleteCharAt(word, index);
                index--;
            }
           
        }
        System.out.print(word);

        

    }
    private static String deleteCharAt(String strValue, int index) {
        return strValue.substring(0, index) + strValue.substring(index + 1);

    }

}
