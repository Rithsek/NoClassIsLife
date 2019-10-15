import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class CompoundWords
{

    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(System.in);
       //BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
        ArrayList<String> array = new ArrayList<String>();
        ArrayList<String> resutl = new ArrayList<String>();

        boolean found = input.hasNextLine();

        while (found)
        {
            
            String word = input.next();
            if(word.isEmpty())
            {
                found = false;
                break;
            }
            array.add(word);
            //System.out.println(word);
            //System.out.println(array);
        }
        input.close();
        System.out.println(array);
        
    }

}
