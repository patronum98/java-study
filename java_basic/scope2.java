package java_basic;

public class scope2 {
    static int i; //전역변수

    static void a() {
        i = 0; //전역변수에서 선언된 변수 i. a()에서 따로 선언하지 않음.
    }

    public static void main(String[] args) {
        for (i = 0; i < 5; i++) { // 전역변수 i 를 사용하고있다.
            a(); // i++를 통해 증감이 되지만 전역변수의 영향을 받기 때문에 i의 값을 계속 0으로 바꿈.
            System.out.println(i); // 0 무한 출력
        }
    }
}
