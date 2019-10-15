import java.util.*;
/**
 * 
 */

/**
 * @author Rithsek
 *
 */
public class ACM_Score
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner inScanner = new Scanner(System.in);
        int time;
        String idsString;
        String solutionString;
        ArrayList<Integer> arrayTimeArrayList = new ArrayList<>();
        ArrayList<String> arrayID = new ArrayList<>();
        ArrayList<String> arraySolutionArrayList = new ArrayList<>();
        time = inScanner.nextInt();
        int  total = 0;
        int count =0;
        while(time != -1)
        {
            idsString = inScanner.next();
            solutionString = inScanner.next();
            //arrayTimeArrayList.add(time);
            if(!arrayID.contains(idsString))
            {
                if(solutionString.equals("wrong"))
                {
                    arrayTimeArrayList.add(20);
                    arrayID.add(idsString);
                }
                else {
                   total += time;
                   count++;
                }

            }
            else {
                int index = arrayID.indexOf(idsString);
                if(solutionString.equals("wrong"))
                {
                    int temp = arrayTimeArrayList.get(index);
                    temp += 20;
                    arrayTimeArrayList.add(index, temp);
                    arrayTimeArrayList.remove(index+1);
                }
                else {
                    int temp = arrayTimeArrayList.get(index);
                    total += time;
                    total += temp;
                    arrayTimeArrayList.remove(index);
                    arrayID.remove(index);
                    count++;
                }
            }

            time = inScanner.nextInt();
           // System.out.println(total);
        }
        
        System.out.print(count + " "+ total);


    }

}
