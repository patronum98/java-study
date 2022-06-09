package java_basic;

public class foreach {
    public static void main(String[] args) {
        String[] members = { "a", "b", "c" };
        for (String e : members) { // e 에서 mambers의 요소를 하나씩 꺼내서 출력
            System.out.println(e);
        }
    }
}
