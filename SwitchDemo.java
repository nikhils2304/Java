public class SwitchDemo {

    public static void main(String[] args) {
        //int f = 1;
        //switch(f){
        //    case 1:
        //    System.out.println("One"); break;
        //    default:
        //    System.out.println("False"); 
        int day = new java.util.Scanner(System.in).nextInt();
        switch(day){
            case 1 -> System.out.println("It's a Monday. Concentrate on studies");
            case 2,3,4 -> System.out.println("meh");
            case 5 -> System.out.println("pencho friday ae");
            case 6,7 -> System.out.println("Enjoy the weekend");
            default -> System.out.println("Invalid day");

        }
    
    }
}
    

