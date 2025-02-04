import java.util.Scanner;

public class CircleAreaa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the circle : ");
        float radius = scanner.nextFloat();
        float area = (float) (3.14 * radius * radius);
        System.out.println("Area of the circle is : " +area);
        scanner.close();

    }
    
}
