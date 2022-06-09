package java_basic;

public class constant {
    public static void main(String[] args) {
        int a = 2;
        double b = 2.2;
        //float c = 2.2; //에러 : 자바에서 실수형 상수는 double의 타입. float로 선언된 변수 c에 double타입의 상수 2.2를 대입하니 에러
        float c = 2.2F; // 2.2가 float라는걸 F를 써주어 명시해야 한다.
    }
}
