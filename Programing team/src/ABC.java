import java.util.Arrays;
import java.util.Scanner;

public class ABC
{

    public static void main(String[] args)
    {
        
      Scanner input = new Scanner(System.in);
      int [] data = new int[3];
      
      
      for(int i=0;i<3;i++)
      {
          data[i] = input.nextInt();
      }
      String order = input.next();
      Arrays.sort(data);
      int first = data[0];
      int second = data[1];
      int third = data[2];
      
      for(int i=0;i<3;i++)
      {
          if(order.charAt(i)=='A')
          {
              data[i] = first;
          }
          if(order.charAt(i)=='B')
          {
              data[i] = second;
          }
          if(order.charAt(i)=='C')
          {
              data[i] = third;
          }
         
      }
      
      for(int i=0;i<3;i++)
      {
          System.out.print(data[i]+ " ");
      }
 
      
    }

}
