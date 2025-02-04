import java.util.Scanner;

public class AsciiToChar {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an ASCII code (0 - 127) : ");
        int asciiCode = scanner.nextInt();
        char character = (char) asciiCode;
        System.out.println("The character for ASCII code " + asciiCode + " is : " + character);
        scanner.close();

    }

}
