import java.util.Scanner;

public class Spavanac
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int Hour = input.nextInt();
        int minute = input.nextInt();
        if(minute >= 45)
        {
            minute = minute -45;
        }
        else
        {
            if(Hour == 0)
            {
                Hour = 23; 
                minute = minute + 15;
            }
            else if(Hour >= 0)
            {
                Hour = Hour -1;
                minute = minute + 15;     
            }
        }
        System.out.print(Hour+" ");
        System.out.print(minute);
    }

}
