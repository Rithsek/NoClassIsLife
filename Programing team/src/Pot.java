import java.util.ArrayList;
import java.util.Scanner;

public class Pot
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> arrayfirst = new ArrayList();
        ArrayList<Integer> arraysecond = new ArrayList();
        ArrayList<String> arrayString = new ArrayList();
        int num; 
        num = sc.nextInt();
        int result = 0;
        
        for(int index = 0; index < num; ++index)
        {
            arrayString.add(sc.next());
            //System.out.println(arrayString.get(index));
            arrayfirst.add(Integer.parseInt(arrayString.get(index).substring(0, arrayString.get(index).length() -1)));
            arraysecond.add(Integer.parseInt(arrayString.get(index).substring(arrayString.get(index).length()-1, arrayString.get(index).length())));
            //System.out.println(arrayfirst.get(index));
            //System.out.println(arraysecond.get(index));
            result += Math.pow(arrayfirst.get(index), arraysecond.get(index));
        }
        System.out.print(result);
    }
}
