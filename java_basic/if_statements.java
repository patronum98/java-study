package java_basic;

public class if_statements {
    public static void main(String[] args) {
        if (true) {
            System.out.println(1); // 1
            System.out.println(2); // 2
            System.out.println(3); // 3
        }
        if (false) {
            System.out.println(4); // x
        }

        if (true) {
            System.out.println(1); // 1
        } else {
            System.out.println(2); // x
        }

        if (false) {
            System.out.println(1);
        } else if (true) {
            System.out.println(2); // 2만 출력. true 뒤로는 출력 안함
        } else if (true) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }
}
