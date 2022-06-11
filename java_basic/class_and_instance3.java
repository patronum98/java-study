package java_basic;

//클래스 변수

class Calculator3{
    int left, right;
    static int base = 0;


    public void setOprands (int left, int right){
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right + base);
    }

    public void avg() {
        System.out.println((this.left + this.right)/2);
    }
}

public class class_and_instance3 {

    public static void main(String[] args) {

        Calculator3 c1 = new Calculator3();
        c1.setOprands(10, 20);
        // 30 출력
        c1.sum();

        Calculator3 c2 = new Calculator3();
        c2.setOprands(20, 40);
        // 60 출력
        c2.sum();

        // 클래스 변수 base의 값을 10으로 지정했다.
        Calculator3.base = 10;

        // 40 출력
        c1.sum();

        // 70 출력
        c2.sum();
    }
}

