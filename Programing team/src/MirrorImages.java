import java.util.Scanner;

public class MirrorImages
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int testCase = input.nextInt();
        String[][] array;
        for(int index = 0; index <testCase; ++index )
        {
            int Row = input.nextInt();
            int Colomn = input.nextInt();
            array = new String[Row][Colomn];
            for(int index1 = 0; index1 < Row; ++index1)
            {
                for(int index2 = 0; index2 < Row; ++index2)
                {
                    array[index1][index2] = input.next();
                }
            }
            for(int index1 = 0; index1 < Row; ++index1)
            {
                for(int index2 = 0; index2 < Row; ++index2)
                {
                   System.out.printf("&5d", array[index1][index2]); 
                }
            }
            
        }
        

    }

}
