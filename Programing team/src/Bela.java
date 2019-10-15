import java.util.Scanner;

public class Bela
{

    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       
       int hands = input.nextInt();
       String suit = input.nextLine();
       char SUIT = suit.charAt(1);
       String[] array = new String[hands*4];
       
       for(int index = 0; index < array.length; ++index)
       {
           array[index] = input.nextLine();
       }
     
       
       int result = 0;
       for(int index = 0; index < array.length; ++index)
       {
        
           
           if(array[index].charAt(1) == SUIT)
           {
               if(array[index].charAt(0) == 'A')
               {
                   result += 11;
               }
               if(array[index].charAt(0) == 'K')
               {
                   result += 4;
               }
               if(array[index].charAt(0) == 'Q')
               {
                   result += 3;
               }
                if(array[index].charAt(0) == 'J')
               {
                   result += 20;
               }
               if(array[index].charAt(0) == 'T')
               {
                   result += 10;
               }
               if(array[index].charAt(0) == '9')
               {
                   result += 14;
               }
               if(array[index].charAt(0) == '8')
               {
                   result += 0;
               }
               if(array[index].charAt(0) == '7')
               {
                   result += 0;
               }
           }
           else
           {
               if(array[index].charAt(0) == 'A')
               {
                   result += 11;
               }
               if(array[index].charAt(0) == 'K')
               {
                   result += 4;
               }
               if(array[index].charAt(0) == 'Q')
               {
                   result += 3;
               }
               if(array[index].charAt(0) == 'J')
               {
                   result += 2;
               }
               if(array[index].charAt(0) == 'T')
               {
                   result += 10;
               }
               if(array[index].charAt(0) == '9')
               {
                   result += 0;
               }
               if(array[index].charAt(0) == '8')
               {
                   result += 0;
               }
               if(array[index].charAt(0) == '7')
               {
                   result += 0;
               }
           }
         
       }
       
       System.out.println(result);

    }

}
