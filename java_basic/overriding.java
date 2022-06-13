package java_basic;

class Calculator_overriding {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public int avg() {
        return ((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator_overriding extends Calculator_overriding {

    public void sum() {
        System.out.println("output : " +(this.left + this.right)+" -- ");
    }

    public int avg() {
        return super.avg(); //return해줘도 되지만 super.으로도 접근 가능
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class overriding {
    public static void main(String[] args) {
        SubstractionableCalculator_overriding c1 = new SubstractionableCalculator_overriding();
        c1.setOprands(10, 20);
        c1.sum(); //자식클래스의 sum 이 실행된다.
        System.out.println("output : " + c1.avg()); // int로 같은 데이터 타입이라 실행된다. 부모 void 자녀 int면 실행 X
        c1.substract();
    }
}

/*
오버라이딩의 조건
1. 메소드 이름
2. 메소드 매개변수와 숫자와 데이터타입 그리고 순서
3. 메소드의 리턴 타입
 */