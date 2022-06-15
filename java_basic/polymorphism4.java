package java_basic;

abstract class Calculator_poly{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    int _sum() {
        return this.left + this.right;
    }
    public abstract void sum();
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }
}
class CalculatorDecoPlus_poly extends Calculator_poly {
    public void sum(){
        System.out.println("+ sum :"+_sum());
    }
    public void avg(){
        System.out.println("+ avg :"+(this.left+this.right)/2);
    }
}
class CalculatorDecoMinus_poly extends Calculator_poly {
    public void sum(){
        System.out.println("- sum :"+_sum());
    }
    public void avg(){
        System.out.println("- avg :"+(this.left+this.right)/2);
    }
}
public class polymorphism4 {
    public static void execute(Calculator_poly cal){
        System.out.println("실행결과");
        cal.run();
    }
    public static void main(String[] args) {
        Calculator_poly c1 = new CalculatorDecoPlus_poly();
        c1.setOprands(10, 20);

        Calculator_poly c2 = new CalculatorDecoMinus_poly();
        c2.setOprands(10, 20);

        execute(c1);
        execute(c2);
    }
}
