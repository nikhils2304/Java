

public class OverloadedConstructor {
    
    int a;
    int b;

    public OverloadedConstructor(){
        a = 0;
        b = 0;
    }

    public OverloadedConstructor(){
        this.a = a;
        b = 0;
    }

    public OverloadedConstructor(){
        this.a = a;
        this.b = b;
    }

    public vooid display(){
        System.out.println("a : " + a + "b : " + b);
    }

    public static void main(String[] args) {
        OverloadedConstructor obj1 = new OverloadedConstructor();
        OverloadedConstructor obj2 = new OverloadedConstructor(10);
        OverloadedConstructor obj3 = new OverloadedConstructor(10, 20);
        obj1.display();
        obj2.display();
        obj3.display();
    }

}
