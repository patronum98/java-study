package java_basic;

class poly_A_1{
    public String x(){return "A.x";}
}
class poly_B_1 extends poly_A_1{
    public String x(){return "B.x";}
    public String y(){return "y";}
}
class poly_B2_1 extends poly_A_1{
    public String x(){return "B2.x";}
}
public class polymorphism3 {
    public static void main(String[] args) {
        poly_A_1 obj = new poly_B_1();
        poly_A_1 obj2 = new poly_B2_1();
        System.out.println(obj.x()); //B.x
        System.out.println(obj2.x()); //B2.x
    }
}
