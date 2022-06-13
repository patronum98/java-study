package java_basic;

public class scope3 {
    static int i; //전역변수 i 선언

    static void a() {
        int i = 0; //지역변수선언 int i = 0. a() 안에서는 지역변수가 우선순위가 더 높다.
    }

    public static void main(String[] args) {
        for (i = 0; i < 5; i++) { //for문 내에서 선언해도 같은 결과.
            a(); // 왜 사용 안하지? -스터디시간에 물어볼것.
            System.out.println(i);
        }
    }

}
