
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);                
        System.out.println("How old are you?");
        int num1 = Integer.parseInt(reader.nextLine());
        if (num1 >= 18)
        {
        System.out.println("You have reached the age of majority!");
        }
        else
        {
        System.out.println("You have not reached the age of majority yet!");
        }
    }
}
