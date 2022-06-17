package java_basic;

// 자바에서 모든 클래스는 사실 Object를 암시적으로 상속받고 있다.

class Calculator_object{
    int left, right;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left+this.right);
    }

    public void avg(){
        System.out.println((this.left+this.right)/2);
    }

    public String toString(){
        return "left : " + this.left + ", right : "+ this.right;
    }
}

public class object1 {

    public static void main(String[] args) {

        Calculator_object c1 = new Calculator_object();
        c1.setOprands(10, 20);
        System.out.println(c1); // toString을 직접 호출하지 않아도 어떤 객체를 System.out.print로 호출하면 자동으로 toString이 호출되도록 약속되어 있다.
        System.out.println(c1.toString());
    }

}
