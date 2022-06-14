package java_basic;

class Calculator_access{
    private int left, right;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    private int _sum(){ //실제로 계산하는 메소드. 직접적으로 접근 불가능
        return this.left+this.right;
    }
    public void sumDecoPlus(){ //출력
        System.out.println("++++"+_sum()+"++++");
    }
    public void sumDecoMinus(){ //출력
        System.out.println("----"+_sum()+"----");
    }
}

public class access2 {
    public static void main(String[] args) {
        Calculator_access c1 = new Calculator_access();
        c1.setOprands(10, 20);
        c1.sumDecoPlus();
        c1.sumDecoMinus();
    }
}

/*
	                        public	protected	default	private
같은 패키지, 같은 클래스        허용	    허용	        허용	    허용
같은 패키지, 상속 관계	        허용	    허용	        허용	    불용
같은 패키지, 상속 관계 아님	    허용	    허용	        허용	    불용
다른 패키지, 상속 관계	        허용	    허용      	불용	    불용
다른 패키지, 상속 관계 아님	    허용	    불용	        불용  	불용

 */