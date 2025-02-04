public class AddNumbers {

    int a;
    int b;

    public AddNumbers(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getSum(){
        return a + b;
    }

    public static void main(String[] args) {
        AddNumbers obj = new AddNumbers(10, 20);
        System.out.println("Sum: " + obj.getSum());
    }
     
}
