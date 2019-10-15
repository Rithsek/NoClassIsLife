import java.util.Scanner;

public class Oktalni
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        String number = input.next();
        int result = 0;
        for(int index = 0; index < number.length(); ++index)
        {
           result += (int) Math.pow(2, number.length()-index-1)*Integer.parseInt(Character.toString(number.charAt(index))); 
        }
        System.out.print(result);
    }

}
