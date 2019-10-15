import java.util.*;
/**
 * 
 */

/**
 * @author Rithsek
 *
 */
public class Bacon
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner inScanner = new Scanner(System.in);
        int num_of_line = inScanner.nextInt();
        HashMap<String, ArrayList<String>> myHashMap = new HashMap<>();
        while (num_of_line != 0)
        {
            String lineString = inScanner.nextLine();
            ArrayList<String> myarrayList = new ArrayList<>();
            String [] arrayList = lineString.split(" ");
            for (int i = 1; i < arrayList.length; i++)
            {
                myarrayList.add(arrayList[i]);
            }
            Collections.sort(myarrayList);
            myHashMap.put(arrayList[0], myarrayList);
        }
        System.out.println(myHashMap);
    }

}
