package org.amigoscode;

import java.util.ArrayList;
import java.util.List;

public class InterviewNotes {
    
    // static keyword: means the methods\class is shared across all the objects created from the method\class
    // static target class\method\variable the targeted is shared among the entire class
    // static variable you can call it anywhere within the class
    public static final String staticVar = "static var";
    // you can also group the static of the class together
    public static String BRAND;
    static List list;
    static {
        BRAND = "static variable";
        list = new ArrayList();
        list.add("d");
    }

    public static void main(String[] args) {

        // Integer vs int "for primitive we have object equivilnt
        // Integer int - double Double - long Long
        // var is primitive
        int number = 9;
        // number. will not call any methods belong to Integer
        Integer numberInteger = 9;
        // integerNumber. will call a lot of methods belong to Integer class a lot of math methods


        // Ternary operator possible only in one case
        var age = 25;
        String message = age >= 18 ? "Ternary operator: I am an Adult" : " I am not adult";
        System.out.println(message);
        // Ternary operator: I am an Adult

    }

    public static void log(int[] numbers) {
        // Big O Notation data structure
        // O(2) this means it will constantly two times first then second 
        // O(n) is the number of times the code will run to out put something 
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        // ---

        // lets count the cost of O(n)
        // o( 2 + 999) which simplified to o(999) or o(n)
        int count = 1000;
        System.out.println("first"); // o(1)
        for (int i = 0; i < count; i++) {
            System.out.println(i);
        } // o(999)
        System.out.println("2"); // o(1)
    }   // and if we have two loops it will be o(2n)
        // this is called linear growth

}
