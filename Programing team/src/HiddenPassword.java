import java.util.ArrayList;
import java.util.Scanner;

public class HiddenPassword
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String password = input.next();
        String word = input.next();
        ArrayList<Character> arrayOfPassword = new ArrayList<Character>();
        ArrayList<Character> array = new ArrayList<Character>();
        for(int index = 0; index < password.length();++index )
        {
            arrayOfPassword.add(password.charAt(index));
        }
        for(int index = 0; index < word.length(); ++index)
        {
            array.add(word.charAt(index));
        }
        boolean yes = false;
        for(int index = 0; index < arrayOfPassword.size(); ++index)
        {
            boolean found = array.contains(arrayOfPassword.get(index));
            //System.out.println(found);
            System.out.println(array.indexOf(arrayOfPassword.get(index)));
            if(found == true && (array.indexOf(arrayOfPassword.get(index)) < array.indexOf(arrayOfPassword.get(index+1))))
            {
             yes = true;
             array.remove(array.indexOf(arrayOfPassword.get(index)));
            }
            else
            {
                yes = false;
            }
            
        }
        System.out.println(yes);
        if(!yes)
        {
            System.out.print("FALL");
        }
        else 
        {
            System.out.print("PASS");
        }


    }

}
