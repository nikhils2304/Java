public class Demo2 {
    public int addNumbers(int a, int b) {
        int c = a + b;
        return c;
    }
    public static void main(String[] args) {
        Demo2 demo = new Demo2();
        int result = demo.addNumbers(10, 20);
        System.out.println(result);
    }
}
