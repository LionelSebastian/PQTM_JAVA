
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First:");
        int from = Integer.parseInt(reader.nextLine());
        System.out.println("Second:");
        int till = Integer.parseInt(reader.nextLine());
        
        int num = from;
        while (num<= till)
        {
            System.out.println(num+"\n");
            num++;
        }

    }
}
