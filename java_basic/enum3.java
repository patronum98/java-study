package java_basic;

public class enum3 {

    public static void main(String[] args) {
        for(Fruit2 f : Fruit2.values()){
            System.out.println(f+", "+f.getColor());
        }
    }
}
