package java_basic;

public class and_or_not {
    public static void main(String[] args) {
        // and
        if (true && true) {
            System.out.println(1); // 출력
        }

        if (true && false) {
            System.out.println(2);
        }

        if (false && true) {
            System.out.println(3);
        }

        if (false && false) {
            System.out.println(4);
        }

        // or
        if (true || true) {
            System.out.println(1);
        }
        if (true || false) {
            System.out.println(2); //출력
        }
        if (false || true) {
            System.out.println(3); //출력
        }
        if (false || false) {
            System.out.println(4); //출력
        }

        //not
        if (!true) { //!true = fasle
            System.out.println(1);
        }
        if (!false) { //!fasle = true
            System.out.println(2); // 출력
        }
    }
}
