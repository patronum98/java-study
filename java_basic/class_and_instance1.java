package java_basic;

class Calculator1{
    int left, right;

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

public class class_and_instance1 {

    public static void main(String[] args) {

        Calculator1 c1 = new Calculator1(); //new를 통해 새 인스턴스를 생성하고 변수에 담는다. Calculator의 메소드 사용가능. c1의 데이터타입은 Calculator. 구체적인 객체 : 인스턴스
        c1.setOprands(10,20); //setOPrands메소드의 this를 통해 10과 20이 변수에 담긴다
        c1.sum(); //호출
        c1.avg(); //호출

        Calculator1 c2 = new Calculator1();
        c2.setOprands(30,40);
        c2.sum();
        c2.avg();
    }
}
