package fundamentals;
import java.util.
public class UniqueElements {

    public static void main(String[] args) {
        int arr[], n;
       // arr = new int[10];
       // arr[0] = 100;
       // arr[1] = 200;
       // arr[2] = 300;
       // String str = ""+100;
       n = in.nextInt();
       arr = new int[n];
       for (int i = 0; i < n; i++){
        boolean found = false;
        for (int j = i - 1; j >= 0; j++)
            if (arr[i] == arr[j]){
                found = true; break;

            }
        
       }
       System.out.println(arr[0] + " " + arr(1));
    }

    
}
