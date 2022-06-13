package java_basic;

class Calculator_overloading{
    int left, right;
    int third = 0;

    public void setOprands(int left, int right){
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }

    public void setOprands(int left, int right, int third){
        System.out.println("setOprands(int left, int right, int third)");
        this.left = left;
        this.right = right;
        this.third = third;
//        this.setOprands(left, right); //this.setOprands 를 사용하여 변수 중복 최소화도 가능(결과는 조금 다름)
//        System.out.println("setOprands(int left, int right, int third)");
//        this.third = third;
    }

    public void sum(){
        System.out.println(this.left+this.right+this.third);
    }

    public void avg(){
        System.out.println((this.left+this.right+this.third)/3);
    }
}

public class overloading1 {

    public static void main(String[] args) {

        Calculator_overloading c1 = new Calculator_overloading();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.setOprands(10, 20, 30);
        c1.sum();
        c1.avg();

    }

}
