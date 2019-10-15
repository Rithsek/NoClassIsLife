import java.util.Scanner;

public class OneChickenPerPerson
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();
        int third = first - second;
        if(first != second)
        {
            if(first < second)
            {
                System.out.print("Dr. Chaz will have "+ Integer.toString(Math.abs(third)) +" pieces of chicken left over!");
            }
            else if(first > second)
            {
                System.out.print("Dr. Chaz needs "+ Integer.toString( Math.abs(third))+ " more pieces of chicken!");
            }
        }
        
    }

}
