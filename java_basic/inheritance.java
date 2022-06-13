package java_basic;

class inheritanceC{
    int left, right;

    public void setOprands (int left, int right){
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right)/2);
    }
}

class SubstractionableCalculator extends inheritanceC { //SubstractionableCalculator는 inheritanceC를 상속받았다. super : inheritanceC, sub : SubstractionableCalculator
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

class MultiplicationableCalculator extends SubstractionableCalculator { //MultiplicationableCalculator는 inheritanceC를 상속받은 SubstractionableCalculator를 상속
    public void multiplication() {
        System.out.println(this.left * this.right);
    }
}

class DivisionableCalculator extends MultiplicationableCalculator { //상속에 상속에 상속..
    public void division() {
        System.out.println(this.left / this.right);
    }
}

public class inheritance {

    public static void main(String[] args) {

        DivisionableCalculator c1 = new DivisionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
        c1.multiplication();
        c1.division();
    }
}
