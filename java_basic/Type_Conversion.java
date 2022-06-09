package java_basic;

public class Type_Conversion {
    public static void main(String[] args) {
        //자동 형 변환 : 표현범위가 좁은 데이터타입에서 넓은 데이터 타입으로. 좁 -> 넓
        int a = 3;
        float b = 1.0F;
        double c = a + b;
        System.out.println(c); //4.0

        //명시적 형 변환 : 괄호 안에 데이터 타입을 지정해서 값 위에 위치시키는 것
        //float a1 = 100.0; -> float a1 = (float)100.0;
        //int b1 = 100.0F; -> int b1 = (int)100.0F;
        float a1 = (float)100.0;
        int b1 = (int)100.0F;
        System.out.println(a1); //100.0
        System.out.println(b1); //100

        //계산할때도 자동 형 변환이 된다.
        int a2 = 10;
        int b2 = 3;

        float c2 = 10.0F;
        float d2 = 3.0F;

        System.out.println(a2/b2); //3
        System.out.println(c2/d2); //3.3333333
        System.out.println(a2/d2); //3.3333333
    }
}
