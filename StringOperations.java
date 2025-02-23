public class StringOperations {

    public static void concatenateStrings(int count) {
        long startTime;

        startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < count; i++) str += "A";
        System.out.println("String Time: " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) sb.append("A");
        System.out.println("StringBuilder Time: " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < count; i++) sbf.append("A");
        System.out.println("StringBuffer Time: " + (System.nanoTime() - startTime));
    }

    public static void reverseString(String input) {
        long startTime;

        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder(input).reverse();
        System.out.println("Reversed with StringBuilder: " + sb + ", Time: " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer(input).reverse();
        System.out.println("Reversed with StringBuffer: " + sbf + ", Time: " + (System.nanoTime() - startTime));
    }

    public static void replaceSubstring(String input, String target, String replacement) {
        long startTime;

        startTime = System.nanoTime();
        input.replace(target, replacement);
        System.out.println("Replaced with String: Time: " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        new StringBuilder(input).replace(0, target.length(), replacement);
        System.out.println("Replaced with StringBuilder: Time: " + (System.nanoTime() - startTime));

        startTime = System.nanoTime();
        new StringBuffer(input).replace(0, target.length(), replacement);
        System.out.println("Replaced with StringBuffer: Time: " + (System.nanoTime() - startTime));
    }

    public static void main(String[] args) {
        concatenateStrings(10000);
        
        reverseString("NPTEL Java");

        replaceSubstring("Hello World", "Hello", "Hi");
    }
}
