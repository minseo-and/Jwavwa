package main.newclass;

@FunctionalInterface
interface B {
    public void run();
}

class Inner {
    void method(int arg) {
        int local = 10;

        B b = () -> {

            System.out.println(arg);
            System.out.println(local);
        };
        b.run();
    }
}

public class A {
    public static void main(String[] args) {
        Inner i = new Inner();
        i.method(3);

    }
}
