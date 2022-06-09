package java_basic;

public class break_continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                break;
            System.out.println("Coding Everybody " + i);
        }
        System.out.println("---------------------");

        for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue;
            System.out.println("Coding Everybody " + i);
        }
        System.out.println("---------------------");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + "" + j);
            }
        }

    }
}
