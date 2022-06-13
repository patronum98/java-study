package java_basic;

//SubstractionableCalculator의 생성자로 left와 right의 값을 받아서 초기화

class Calculator_1 {
    int left, right;

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

class SubstractionableCalculator_1 extends Calculator_1 {
    public SubstractionableCalculator_1(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class inheritance_and_constructor1 {
    public static void main(String[] args) {
        SubstractionableCalculator_1 c1 = new SubstractionableCalculator_1(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}