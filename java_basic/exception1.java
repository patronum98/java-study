package java_basic;

// try...catch

class Calculator_exception1{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
        try { // try : 예외의 발생이 예상되는 로직
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right); // 에러 발생. 10/0
            System.out.print(" 입니다.");
        } catch(Exception e){ // catch : 예외가 발생했을때 실행되는 로직. (Exception e) 는 예외클래스 인스턴스
            System.out.println("\n\ne.getMessage()\n"+e.getMessage()); //오류에 대한 기본적인 내용을 출력. 상세X
            System.out.println("\n\ne.toString()\n"+e.toString()); //.getMessage()보다 더 자세한 예외 정보를 제공
            System.out.println("\n\ne.printStackTrace()"); // getMessage, toString과는 다르게 printStackTrace는 리턴값이 없다.
            e.printStackTrace(); // 가장 자세한 예외 정보를 제공
        }
    }
}
public class exception1 {
    public static void main(String[] args) {
        Calculator_exception1 c1 = new Calculator_exception1();
        c1.setOprands(10, 0);
        c1.divide();
    }
}
