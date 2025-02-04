public class CircleeArea {
    public void areaNoArgNoReturn() {
        double radius = 5.0;
        double area = Math.PI * radius * radius;
        System.out.println("Area (no arg, no return): " + area);
    }
    
    public void areaWithArgNoReturn(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area (with arg, no return): " + area);
    }
    
    public double areaNoArgWithReturn() {
        double radius = 7.0;
        return Math.PI * radius * radius;
    }
    
    public static void main(String[] args) {
        CircleeArea ca = new CircleeArea();
        ca.areaNoArgNoReturn();
        ca.areaWithArgNoReturn(10.0);
        double areaValue = ca.areaNoArgWithReturn();
        System.out.println("Area (no arg, with return): " + areaValue);
    }
}