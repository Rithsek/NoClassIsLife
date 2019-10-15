import java.util.Scanner;

public class Aaah
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String first = input.nextLine();
        String second = input.nextLine();


        if(first.length() >= second.length())
        {
            System.out.print("go");
        }
        else
        {
            System.out.print("no");
        }
    }

}
