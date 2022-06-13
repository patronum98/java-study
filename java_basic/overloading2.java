package java_basic;

public class overloading2 {
    void A (){System.out.println("void A()");}
    void A (int arg1){System.out.println("void A (int arg1)");}
    void A (String arg1){System.out.println("void A (String arg1)");}
//    int A (){System.out.println("void A()");} //오류발생. 자바가 어떤 매소드를 호출하는지 알수 없다.
    public static void main(String[] args) {
        overloading2 od = new overloading2();
        od.A();
        od.A(1);
        od.A("coding everybody");
    }
}
