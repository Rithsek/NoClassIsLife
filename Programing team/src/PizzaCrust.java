import java.util.Scanner;

public class PizzaCrust
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int R = input.nextInt();
        int C = input.nextInt();
        
        double result = ( Math.pow((R-C), 2)/ Math.pow(R, 2))*100;
       
        double jacob = 0.000000;
        result += jacob;
        System.out.println(result);
        

    }

}
