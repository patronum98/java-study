package java_basic;

// 오버로딩은 가장 이해하기 쉬운 다형성의 예

class O{
    public void a(int param){
        System.out.println("number");
        System.out.println(param);
    }
    public void a(String param){
        System.out.println("char");
        System.out.println(param);
    }
}
public class polymorphism1 {
    public static void main(String[] args) {
        O o = new O();
        o.a(1);;
        o.a("one");
    }
}
