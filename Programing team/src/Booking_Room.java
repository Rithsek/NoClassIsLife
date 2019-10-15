import java.util.*;
/**
 * 
 */

/**
 * @author Rithsek
 *
 */
public class Booking_Room
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner inScanner = new Scanner(System.in);
        int num_of_room = inScanner.nextInt();
        int num_of_room_booked = inScanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (num_of_room == num_of_room_booked)
        {
            System.out.print("too late");
            System.exit(0);
        }
        for (int i = 1; i < num_of_room+1; i++)
        {
            arrayList.add(i);
        }
        for (int index = 0; index < num_of_room_booked; index++)
        {
            int input = inScanner.nextInt();
          arrayList.remove(arrayList.indexOf(input));
           
        }
        System.out.print(arrayList.get(0));

    }

}
