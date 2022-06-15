package java_basic;

// 가짜 클래스인 CalculatorDummy를 실제 로직으로 교체

public class interface4 {
    public static void main(String[] args) {
        interface3 c = new interface3();
        c.setOprands(10, 20, 30);
        System.out.println(c.sum()+c.avg());
    }
}

/*
인터페이스 규칙
1. 하나의 클래스가 여러개의 인터페이스를 구현 할 수 있다.
2. 인터페이스도 상속이 된다.
3. 인터페이스의 맴버는 반드시 public이다.
 */