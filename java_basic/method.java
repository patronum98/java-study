package java_basic;

public class method {
    public static void numbering(int init, int limit) {
        for (int i = init; i < limit; i++)
            System.out.println(i);
    }

    public static void main(String[] args) {
        numbering(3,7);
    }
}
