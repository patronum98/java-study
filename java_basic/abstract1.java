package java_basic;

abstract class A1{ //abstract메소드를 가지면 abstract class가 자동적으로 된다.
    public abstract int b();
    //본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
    //public abstract int c(){System.out.println("Hello")}
    //추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다.
    public void d(){
        System.out.println("world");
    }
}
class B extends A1{ //abstract는 상속하지 않으면 에러가 난다.
    public int b(){return 1;}
}
public class abstract1 {
    public static void main(String[] args) {
        B obj = new B();
    }
}
