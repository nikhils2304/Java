
public class WrapperClassDemo {
    public static void main(String[] args) {
        int x = 10;
        Integer intObj = Integer.valueOf(x); // Explicit boxing using Integer.valueOf
        Integer intObj1 = x; // Autoboxing
        Integer y = 10;
        int z = y; // Unboxing
        System.out.println(x + " " + y + " " + z);
    }
}