package java_basic;

class A {
    public String y(){
        return "public void y()";
    }
    private String z(){
        return "public void z()";
    }
    public String x(){
        return z();
    }
}
public class access1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
        // 아래 코드는 오류가 발생한다.
        //System.out.println(a.z()); //직접 접근 불가능
        System.out.println(a.x()); //클래스를 통해서는 접근 가능. 메소드 x와 메소드 z는 같은 클래스의 소속이기 때문.
    }
}
