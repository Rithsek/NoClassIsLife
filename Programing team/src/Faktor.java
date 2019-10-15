import java.util.*;
/**
 * 
 */

/**
 * @author Rithsek
 *
 */
public class Faktor
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Scanner inScanner = new Scanner(System.in);
        int number_of_article = inScanner.nextInt();
        int faktor = inScanner.nextInt();
        System.out.print(number_of_article*(faktor-1)+1);

    }

}
