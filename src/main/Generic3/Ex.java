package main.Generic3;

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
