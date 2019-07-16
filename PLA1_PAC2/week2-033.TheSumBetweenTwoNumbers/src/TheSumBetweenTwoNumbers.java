
import java.util.Scanner;


public class TheSumBetweenTwoNumbers 
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("First:");
        int from = Integer.parseInt(reader.nextLine());  
        System.out.println("Second:");        
        int until = Integer.parseInt(reader.nextLine()); 
        int num=from;
        int sum =0;
       
        
        while (num<=until)
        {
        sum = sum+num;
        num++;
        }
        System.out.println("The sum is "+sum);
    }
}
