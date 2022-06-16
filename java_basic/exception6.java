package java_basic;

class DivideException extends Exception {
    DivideException(){
        super();
    }
    DivideException(String message){
        super(message);
    }
}
class Calculator_exception6{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide() throws DivideException{
        if(this.right == 0){
            throw new DivideException("No divide 0");
        }
        System.out.print(this.left/this.right);
    }
}
public class exception6 {
    public static void main(String[] args) {
        Calculator_exception6 c1 = new Calculator_exception6();
        c1.setOprands(10, 0);
        try {
            c1.divide();
        } catch (DivideException e) {
            e.printStackTrace();
        }
    }
}
