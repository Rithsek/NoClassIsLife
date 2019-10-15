import java.util.Scanner;

public class EncodedMessage
{

    public static void main(String[] args)
    {
       
        Scanner input = new Scanner(System.in);
        
        int testCase = input.nextInt();
        for(int index = 0; index < testCase; ++index)
        {
            String word = input.next();
            int len = (int) Math.sqrt(word.length());
            char [][] array = new char[len][len];
            
            for(int index1 = 0,index3 = 0; index1 < len&& index3 < word.length();++index3, ++index1)
            {
                for(int index2 = 0 ; index2 < len ; ++index2)   
                {
                    array[index1][index2] = word.charAt(index3);
                    System.out.println(array[index1][index2] );
                }
            }
        }
    }

}
