package java_basic;

public class overloading3 extends overloading2{
    void A (String arg1, String arg2){System.out.println("sub class : void A (String arg1, String arg2)");}
    void A (){System.out.println("sub class : void A ()");}
    public static void main(String[] args) {
        overloading3 od = new overloading3();
        od.A(); //sub class : void A () - 자식클래스가 재 정의 -> 오버라이딩
        od.A(1); //void A (int arg1) -같은 이름이지만 매개변수에 따라 출력 -> 오버로딩
        od.A("coding everybody"); //void A (String arg1) -같은 이름이지만 매개변수에 따라 출력 -> 오버로딩
        od.A("coding everybody", "coding everybody"); // sub class : void A (String arg1, String arg2) -자식클래스가 재 정의 -> 오버라이딩

    }
}

//오버라이딩 : 부모에게 상속받은걸 재정의
//오버로딩 : 매개변수에 따라 같은 이름의 서로 다른 메소드 출력
