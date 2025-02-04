import java.util.Scanner;
public class FibonacciSeries {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int terms = sc.nextInt();

        if(terms <= 0){
            System.out.println("Enter a positive integer.");
        } else{
            int a = 0, b = 1;
            System.out.print(a);
            if(terms >= 2){
                System.out.print(" " + b); 
            }
            for (int i = 3; i <= terms; i++){
                int c = a + b;
                System.out.print(" " + c);
                a = b;
                b = c;
            }
        }
        sc.close();

    }
    
}
