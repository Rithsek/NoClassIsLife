import java.util.Scanner;

public class LongPalindrome
{  
    static char[] text = null;
    static String input;

    public static void main(String[] args) 
    {
        input2array();
        System.out.println( "Longest palindrome is: " + palindrome() );

    }

    static void input2array()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        input = sc.nextLine();

        text = new char[input.length()];

        for(int i=0 ; i < input.length() ; i++)
        {text[i] = input.charAt(i);}
    }

    static String palindrome()
    {
        if(input == null || input.length()<=2)
            return "no palindrome found";

        String palindrome = "";
        int deviation = 0;
        int center = 0;
        int max_deviation = 0;

        for (int i = 1; i < text.length-1; i++)
        {
            if(text[i+1] == text[i-1]) // used to check for palindrome with one center letter
            {
                deviation = 1;

                while( (i-deviation-1) >= 0 && (i+deviation+1) < text.length) // check for array out-of-bounds
                {
                    if (text[i-deviation-1] == text[i+deviation+1])
                        deviation++;
                    else
                        break;
                }

                if (deviation > max_deviation)
                {
                    max_deviation = deviation;
                    center = i;

                    if (center-max_deviation >= 0 && center+max_deviation+1 <= input.length())
                        palindrome = input.substring(center-max_deviation, center+max_deviation+1);

                }
            }

            if(text[i] == text[i+1]) // used to check for palindrome with two center letter
            {
                deviation = 1;

                while( (i-deviation) >= 0 && (i+1+deviation) < text.length) // check for array out-of-bounds)
                {
                    if(text[i-deviation] == text[i+1+deviation])
                        deviation++;
                    else
                        break;
                }

                if (deviation >= max_deviation)
                {
                    max_deviation = deviation ;
                    center = i;

                    if (center-max_deviation+1 >= 0 && center+max_deviation+1 <= input.length())
                        palindrome = input.substring(center-max_deviation+1 , center+max_deviation+1);
                }
            }
        }

        return palindrome;
    }  

}


