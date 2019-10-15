import java.util.ArrayList;
import java.util.Scanner;

public class HelpaPhDcandidateout
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int testCase = input.nextInt();
        ArrayList<String> array = new ArrayList<String>();
        ArrayList<String> result = new ArrayList<String>();

        for(int index = 0; index < testCase; ++index)
        {
            array.add(input.next());

        }
        System.out.println(array);
        
        for(int index = 0; index < array.size(); ++index)
        {
           boolean found = "P=NP".equals(array.get(index));
           System.out.println(found);
            if(found != true);
            {
                result.add("skipped");
            }
            /*if(array.get(index) != "P=NP");
            {
                int delete = array.get(index).indexOf('+');
                String first = array.get(index).substring(0, delete); 
                String second = array.get(index).substring(delete+1, array.get(index).length());
                int third = Integer.parseInt(first)+ Integer.parseInt(second);
                result.add(Integer.toString(third));
            }  */
        }
        System.out.println(result);
    }

}
