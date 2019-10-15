import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BookingaRoom
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numOfRoom = input.nextInt();
        int roomBooked = input.nextInt();

        ArrayList<Integer> BookedRoom = new ArrayList<Integer>();
        ArrayList<Integer> array = new ArrayList<Integer>();

        for(int index = 0; index < roomBooked; ++index)
        {
            BookedRoom.add(input.nextInt());
        }
       
        for(int index = 1; index <= numOfRoom; ++index)
        {
            array.add(index);
        }


        if(numOfRoom == roomBooked)
        {
            System.out.print("too late");
        }
        else
        {
            int aviable = 1;


            for(int index = 1; index <= numOfRoom; ++index )
            {
                if(!BookedRoom.contains(array.get(index-1)))
                {
                    aviable = array.get(index-1);
                    index = numOfRoom;
                }
            }

            System.out.print(aviable);
        }
    }

}


