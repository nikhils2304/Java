
public class CompoundInterest{

    public static void main(String[] arg) {
        long principalAmount = 1000;
        double rateOfInterest = 5.0;
        double timeinYears = 2;
        double interest = principalAmount * Math.pow(1+ rateOfInterest/ 100,timeinYears);
        System.out.println("The compuond interest is: " + interest);
    }
    

}