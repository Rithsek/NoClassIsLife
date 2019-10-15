import java.util.Scanner;

public class CharacterDevelopment
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int Character = input.nextInt();
        
        if(Character == 0 || Character ==1)
        {
            System.out.print(0);
        }
        if(Character == 2)
        {
            System.out.print(1); 
        }
        
    }

}
