import java.util.*;


public class Datum
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int Day = input.nextInt();
        int Month = input.nextInt();
        int day = findDay(Month, Day, 2009);
        String array[] = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday","Sunday"};
       // System.out.print(array[day-1]);
        Date date= new Date(2009,Month,Day);
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(2009, Month, Day);
        System.out.print(array[calendar.get(Calendar.DAY_OF_WEEK)]);
        System.out.print(calendar.get(Calendar.MONTH));

        
    }
    static int findDay(int month, int day, int year)
    {
        int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 }; 
        year -= (month < 3) ? 1 : 0; 
        return ( year + year/4 - year/100 + year/400 + t[month-1] + day) % 7; 
    }

}
