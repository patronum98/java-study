package java_basic;

public class equals {
    public static void main(String[] args) {
        //Run -> Edit Configurations -> Program arguments 값 수정
        String id = args[0];
        if (id.equals("dbtmd")) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
    }
}
