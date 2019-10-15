import java.util.*;
/**
 * 
 */

/**
 * @author Rithsek
 *
 */
public class Card_Trick
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner inScanner = new Scanner(System.in);
        int line = inScanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < line; i++)
        {
            int card = inScanner.nextInt();
            for (int j = 0; j < card; j++)
            {
                arrayList.add(j+1);
            }
            Collections.shuffle(arrayList);
            for (int j = 0; j < card-1; j++)
            {
                System.out.print(arrayList.get(j)+" ");
            }
            System.out.print(arrayList.get(card-1));
            arrayList.clear();
        }

    }

}
