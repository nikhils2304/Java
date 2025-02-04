import java.util.Scanner;

public class LargestElement {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the array elements : ");

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        } 

        int largest = arr[0];

        for (int i = 1; i < n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        System.out.println(largest + " is the largest.");
        sc.close();
    }
    
}
