import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.print( "Enter an integer : ");
         int num = in.nextInt();
         System.out.println(num%9==0?9:num%9);
         in.close();
    }
}
