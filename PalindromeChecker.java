import java.util.Scanner;
public class PalindromeChecker {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input = sc.nextLine();
        String reversed = "";
        for(int i = input.length() - 1; i >= 0; i--){
            reversed += input.charAt(i);
        }

        if (input.equals(reversed)){
            System.out.println("Palindrome.");
        } else{
            System.out.println("Not A Palindrome.");
        }
    
    }
    
}
