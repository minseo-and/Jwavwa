package main.Generic4;

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
    public static <T extends A> void a(T t){
        t.a();
    }

    public static void main(String[] args) {
        a(new A());
        a(new B());
    }
}
