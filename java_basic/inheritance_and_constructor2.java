package java_basic;

class Calculator_2 {
    int left, right;

//    public Calculator_2 () {}  //super(left, right)를 통해 클래스의 기본 생성자 생략 가능

    public Calculator_2(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator_2 extends Calculator_2 {
    public SubstractionableCalculator_2(int left, int right) {
//        this.left = left;
//        this.right = right;
        super(left, right); //상위 클래스를 가리키는 키워드
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class inheritance_and_constructor2 {
    public static void main(String[] args) {
        SubstractionableCalculator_2 c1 = new SubstractionableCalculator_2(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
