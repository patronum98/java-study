package java_basic;

// final : 실행되는 과정에서 한번 값이 정해진 이후에는 변수 내의 값이 바뀌지 않도록하는 규제. 상속, 변경 금지

class Calculator_final {
    static final double PI = 3.14; //변수를 바꿀수 없음
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        //Calculator.PI = 6;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class final1 {

    public static void main(String[] args) {

        Calculator_final c1 = new Calculator_final();
        System.out.println(c1.PI);
//        Calculator.PI = 10;  //허용 X


    }

}
