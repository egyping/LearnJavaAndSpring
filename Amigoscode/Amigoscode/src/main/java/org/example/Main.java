package org.example;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b = a;
        a = 100;
        System.out.println(a + "  " + b);


        Person yassin = new Person("yassin");
        Person yomna = yassin;

    }
    static class Person {
        String name;

        Person(String name) {
            this.name =name;
        }
    }
}