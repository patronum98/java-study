package java_basic;

//클레스 변수

class Calculator2{
    int left, right;
    static double PI = 3.14; // static을 붙여주면 클래스소속 변수가 된다. 어디서나 값이 동일하다.


    public void setOprands (int left, int right){ //class Calculator의 변수에 this를 사용하여 접근 가능하게 한다.
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

public class class_and_instance2 {

    public static void main(String[] args) {

        Calculator2 c1 = new Calculator2();
        System.out.println(c1.PI); //클래스변수를 인스턴스를 통해서 접근

        Calculator2 c2 = new Calculator2();
        System.out.println(c2.PI);

        System.out.println(Calculator2.PI); //클래스 변수를 클래스를 통해 직접적으로 접근.
    }
}

