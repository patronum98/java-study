package java_basic;

class DivideException_5 extends Exception {
    DivideException_5(){
        super();
    }
    DivideException_5(String message){
        super(message);
    }
}
class Calculator_exception5{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
        if(this.right == 0){
            try {
                throw new DivideException_5("No divide 0");
            } catch (DivideException_5 e) {
                e.printStackTrace();
            }
        }
        System.out.print(this.left/this.right);
    }
}
public class exception5 {
    public static void main(String[] args) {
        Calculator_exception5 c1 = new Calculator_exception5();
        c1.setOprands(10, 0);
        c1.divide();
    }
}
