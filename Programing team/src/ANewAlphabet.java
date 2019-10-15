import java.util.ArrayList;
import java.util.Scanner;

public class ANewAlphabet
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        word = word.toLowerCase();


        ArrayList<String> second = new ArrayList<String>();

        String[] third =  {"@", "8", "(", "|)", "3", "#", "6", "[-]", "|", "_|", "|<", "1", "[]\\/[]", "[]\\[]"
                , "0", "|D", "(,)", "|Z", "$", "']['", "|_|", "\\/", "\\/\\/", "}{", "`/", "2"};

        ArrayList<String> fourth = new ArrayList<String>();//assign third to arraylist

        ArrayList<String> sixth = new ArrayList<String>();//assign word to arraylist

        for(int index = 0; index < word.length(); ++index)
        {

            sixth.add(Character.toString(word.charAt(index)));

        }

        for(char index = 'a', i = 0; i< 26 && index <= 'z'; ++i,++index)
        {
            second.add(Character.toString(index));
            fourth.add(third[i]);
        }

        for(int index = 0; index < word.length(); ++index)
        {
            if(second.contains(sixth.get(index)))
            {
                int i = second.indexOf(sixth.get(index));

                sixth.remove(index);
                sixth.add(index, fourth.get(i));   


            }
        }
        for(int index = 0; index < word.length(); ++index)
        {
            System.out.print(sixth.get(index));
        }


    }



}
