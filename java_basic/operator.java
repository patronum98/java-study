package java_basic;

public class operator {
    public static void main(String[] args) {
        // + , -, *, /, % 는 생략

        //증감연산자
        int i = 3;
        i++; // 현재의 값을 먼저 출력 후 증감
        System.out.println(i); // 4
        ++i; // 증감 후 증감된 i 값을 출력
        System.out.println(i); // 5
        System.out.println(++i); // 6
        System.out.println(i++); // 6
        System.out.println(i); // 7
    }
}
