
import java.util.Scanner;


public class UpToCertainNumber 
{

    public static void main(String[] args)
    {
        int number = 1;
        Scanner reader = new Scanner(System.in);
        
        System.out.println("up to what number?");
        int upTo = Integer.parseInt(reader.nextLine());
        
        while (number <= upTo)
        {
            System.out.println(number+"\n");
            number++;
        }        
    }
}

