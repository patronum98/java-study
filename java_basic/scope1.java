package java_basic;

public class scope1 {

    static void a() {
        int i = 0; //지역변수. 중괄호 안에서만 유효하다
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { //for문에서 선언된 변수는 for문의 중괄호 안에서만 유효하다.
            a(); //a() 안에서 선언된 변수 i의 영향을 받지 않음. 유효범위가 다르기 때문. for문에서 선언된 int i = 0 이 사용
            System.out.println(i);
        }
    }
}
