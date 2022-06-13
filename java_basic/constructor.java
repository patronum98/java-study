package java_basic;

class Calculator{
    int left, right;

    public Calculator(int left, int right) { //클래스와 똑같은 이름의 메소드(중요). 생성자. 클래스가 실행될때 생성자가 실행되도록 약속되있다. 어떤 메소드보다 먼저 실행된다.
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right); //this.left, this.right 는 class Calculator의 int lefr, right를 가리킨다
    }

    public void avg() {
        System.out.println((this.left + this.right)/2);
    }
}

public class constructor {

    public static void main(String[] args) {

        Calculator c1 = new Calculator(10, 20); //생성자(10, 20). 인스턴스를 생성하는 생성자.
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator(20, 40);
        c2.sum();
        c2.avg();
    }
}
