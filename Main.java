import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Create an array of integers with a size of 4
        int[] array = new int[4];

        // Prompt the user to enter 4 integers
        System.out.println("Enter 4 integers:");

        // Loop to take input and store it in the array
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // Close the scanner
        scanner.close();

        // Print the elements of the array
        System.out.println("You entered:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}