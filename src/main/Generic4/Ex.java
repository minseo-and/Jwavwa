package main.Generic3;

class A {
    void a(){
        System.out.println("a실행");
    }
}

class B extends A {
    void b(){
        System.out.println("b실행");
    }
}

public class Ex {
    public static <T> T a(T t){
        T tt = t;
        return tt;
    }

    public static void main(String[] args) {
        String t;
        Integer i;
        t = a("hi");
        i = a(1);
        System.out.println(t);
        System.out.println(i);
    }
}
