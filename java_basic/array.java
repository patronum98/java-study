package java_basic;

public class array {
    public static void main(String[] args) {
        String[] classGroup = { "Park", "Son", "Kang", "going" }; //문자열배열 타입에 변수 classGroup를 선언
        System.out.println(classGroup[0]);
        System.out.println(classGroup[1]);
        System.out.println(classGroup[2]);
        System.out.println(classGroup[3]);

        System.out.println("----------------------");

        String[] classGroup1 = new String[4]; //길이가 4인 문자열배열에 변수 classGroup1을 선언
        classGroup[0] = "Park";
        System.out.println(classGroup1.length); //배열의 길이만 출력
        classGroup[1] = "Son";
        System.out.println(classGroup1.length);
        classGroup[2] = "Kang";
        System.out.println(classGroup1.length);
        classGroup[3] = "going";
        System.out.println(classGroup1.length);
    }
}
