package java_basic;

//다중 catch. 표시하고자 하는에러가 하나가 아닐때

class A_exception2{
    private int[] arr = new int[3];
    A_exception2(){
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
    }
    public void z(int first, int second){
        try {
            System.out.println(arr[first] / arr[second]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        } catch(Exception e){ // 가장 포괄적인 에러. 마지막에 위치하면 상관없지만 catch중 가장 먼저 위치했을때는 다른 에러구문들이 실행되지 않는다.
            System.out.println("Exception");
        } finally { // catch가 한번 실행될때마다 무조건 실행된다. 예외와 상관없이 반드시 실행해 줘야 할때 사용
            System.out.println("finally");
        }

    }
}

public class exception2 {
    public static void main(String[] args) {
        A_exception2 a = new A_exception2();
        a.z(10, 0); // 배열에러
        a.z(1, 0); // 수학적에러
        a.z(2, 1); // 2
    }
}