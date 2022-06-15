package java_basic;

class poly_A{
    public String x(){return "A.x";}
}
class poly_B extends poly_A{
    public String x(){return "B.x";}
    public String y(){return "y";}
}
public class polymorphism2 {
    public static void main(String[] args) {
        poly_A obj = new poly_B();
        System.out.println(obj.x()); //B.x
    }
}
