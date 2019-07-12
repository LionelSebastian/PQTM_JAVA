
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the radius:");
        double radius = Double.parseDouble(reader.nextLine());
        double circunference = 2 * Math.PI * radius;
        System.out.println("Circumference of the circle: "+circunference);

         
    }
}
