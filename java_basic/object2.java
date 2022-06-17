package java_basic;

//equals

class Student_object{
    String name;
    Student_object(String name){
        this.name = name;
    }
    public boolean equals(Object obj) { //  equals를 직접 구현해야 한다면 hashCode도 함께 구현해야 함. Code -> Generate -> equals()and hashcode()
        Student_object _obj = (Student_object)obj;
        return name == _obj.name;
    }
}

class object2 {

    public static void main(String[] args) {
        Student_object s1 = new Student_object("egoing");
        Student_object s2 = new Student_object("egoing");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }

}
