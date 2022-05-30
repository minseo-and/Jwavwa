package main;

import java.util.Scanner;

public class GetSetClass {
    private int age;
    private String name;

    GetSetClass(int age, String name){
        this.age = age;
        this.name = name;
    }

    GetSetClass() {
        this(10, "name");
    }

}