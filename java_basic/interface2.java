package java_basic;

// 인터페이스를 구현한 가짜 클래스(CalculatorDummy)를 임시로 사용해서 만든 에플리케이션

class CalculatorDummy implements interface1{
    public void setOprands(int first, int second, int third){
    }
    public int sum(){
        return 60;
    }
    public int avg(){
        return 20;
    }
}
public class interface2 {
    public static void main(String[] args) {
        CalculatorDummy c = new CalculatorDummy();
        c.setOprands(10, 20, 30);
        System.out.println(c.sum()+c.avg());
    }
}
