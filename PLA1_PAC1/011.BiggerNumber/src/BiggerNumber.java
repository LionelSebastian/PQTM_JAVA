
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type a number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        int result = Math.max(num2,num1);
        System.out.println("Teh bigger number of the two numbers given was: "+ result);
    }
}
