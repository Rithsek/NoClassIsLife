import java.io.Reader;
import java.util.Scanner;

public class Squashcar
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int R = reader.nextInt(); int C = reader.nextInt();
        char[][] map = new char[R][C];
        String [] rowArray= new String[R];

        int [] sqaushedCars= new int[5];


        for(int i = 0;i < R;i++)
        {
            rowArray[i] = reader.next();
        }

        for(int i = 0;i < R;i++)
        {
            for(int j= 0;j < C; j++)
            {
                map[i][j]=rowArray[i].charAt(j);
            }
        }

        for(int i = 1;i < R;i++)
        {

            for(int j = 1;j < C; j++)
            {
                int carCounter = 0;
                if(map[i-1][j-1] != '#' && map[i-1][j]  != '#' && map[i][j-1] != '#' && map[i][j] != '#')
                {

                    if(map[i-1][j-1] == 'X') 
                    {
                        carCounter++;
                    }
                    if(map[i-1][j]  == 'X') 
                    {
                        carCounter++;
                    }
                    if(map[i][j-1] == 'X') 
                    {
                        carCounter++;
                    }
                    if(map[i][j] == 'X') 
                    {
                        carCounter++;
                    }
                    if(carCounter==0) sqaushedCars[0]++;
                    if(carCounter==1) sqaushedCars[1]++;
                    if(carCounter==2) sqaushedCars[2]++;
                    if(carCounter==3) sqaushedCars[3]++;
                    if(carCounter==4) sqaushedCars[4]++;
                }
            }
        }

        for(int i= 0;i<5;i++)
        {
            System.out.println(sqaushedCars[i]);
        }
    }

}
