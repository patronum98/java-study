package java_basic;

enum Fruit2{
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    private String color;
    Fruit2(String color){
        System.out.println("Call Constructor "+this);
        this.color = color;
    }
    String getColor(){
        return this.color;
    }
}

enum Company2{
    GOOGLE, APPLE, ORACLE;
}

public class enum2 {

    public static void main(String[] args) {
        Fruit2 type = Fruit2.APPLE;
        switch(type){
            case APPLE:
                System.out.println(57+" kcal, "+Fruit2.APPLE.getColor());
                break;
            case PEACH:
                System.out.println(34+" kcal"+Fruit2.PEACH.getColor());
                break;
            case BANANA:
                System.out.println(93+" kcal"+Fruit2.BANANA.getColor());
                break;
        }
    }
}
