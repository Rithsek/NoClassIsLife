import java.util.*;
/**
 * 
 */

/**
 * @author Rithsek
 *
 */
public class Dice_Cup
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner inScanner = new Scanner(System.in);
        int dice1 = inScanner.nextInt();
        int dice2 = inScanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> resultArrayList = new ArrayList<>();
        for (int index = 1; index < dice1+1; index++)
        {
            for (int i = 1; i < dice2+1; i++)
            {
                arrayList.add(i+index);
            }
        }
        //System.out.println(arrayList);
        Collections.sort(arrayList);
        //System.out.println(arrayList);
        int max = Collections.frequency(arrayList, arrayList.get(0));
        for (int index = 1; index < arrayList.size(); index++)
        {
           int temp =  Collections.frequency(arrayList, arrayList.get(index));
           if(temp >= max && arrayList.get(index)!= arrayList.get(index-1))
           {
               max = temp;
           }
        }
        for (int i = 0; i <arrayList.size(); i++)
        {
            if(Collections.frequency(arrayList, arrayList.get(i)) == max)
            {
                System.out.println(arrayList.get(i));
                i = i+ max -1;
            }
        }
        //System.out.print(max);
    }
}
