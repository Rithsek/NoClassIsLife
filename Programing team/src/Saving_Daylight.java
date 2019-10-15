
import java.util.Scanner;

public class Saving_Daylight
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        String day;
        String month;
        String year;
        String sunrise;
        String sunset;
        int hourRise;
        int hourSet;
        int minuteRize;
        int minuteSet;
         String line = sc.nextLine();
        //System.out.println(firstLine);
        
        while(line.compareTo("") !=0)
        {
            String temString[] = line.split(" ");
            //month = sc.next();
            month = temString[0];
            //sc.next();
            //day = sc.next();
            day = temString[1];
            //sc.next();
            //year = sc.next();
            year = temString[2];
            //sc.next();
            //sunrise = sc.next();
            sunrise = temString[3];
            //sc.next();
            //sunset = sc.next();
            sunset = temString[4];

            hourRise = Integer.parseInt(sunrise.substring(0, sunrise.indexOf(':')));
            minuteRize = Integer.parseInt(sunrise.substring(sunrise.indexOf(':') +1 , sunrise.length()));

            hourSet = Integer.parseInt(sunset.substring(0, sunset.indexOf(':')));
            minuteSet = Integer.parseInt(sunset.substring(sunset.indexOf(':') + 1, sunset.length()));

            if(minuteSet < minuteRize)
            {
                minuteSet += 60;
                hourSet -= 1;

            }
            //  System.out.println(hourRise);
            //System.out.println(minuteRize);

            //System.out.println(sunset.indexOf(':'));

            System.out.println(month + " " + day + " " + year + " " + (hourSet - hourRise) + " hours " + (minuteSet - minuteRize) + " minutes" ); 
            //firstLine = sc.nextLine();
            line = sc.nextLine();
            if(line == null)
            {
                break;
            }
        }
        sc.close();
    }
}
