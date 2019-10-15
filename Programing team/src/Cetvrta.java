import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cetvrta
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<Integer> Array = new ArrayList<Integer>();
        
       for(int index = 0; index < 3; ++index)
       {
           int x = input.nextInt();
           array.add(x);
           int y = input.nextInt();
           Array.add(y);  
       } 
       Point point = new Point(0,0);
       for(int index = 0; index < 3; ++index)
       {
           if(Collections.frequency(array, array.get(index)) == 1)
           {
               point.x = array.get(index);
           }
           if(Collections.frequency(Array, Array.get(index)) == 1)
           {
               point.y = Array.get(index);
           }           
       }
       System.out.print((int)point.getX()+ " ");
       System.out.print((int)point.getY());

    }

}
