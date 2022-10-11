package org.amigoscode;

import java.util.Arrays;
import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        // Methods is logic
        // logic to call and respond and logic you call to help in doing something

        // String and Integer are clases and has some logics methods to help you perform your work
        String test = new String("My Name");
        String test1 = "My Name again";
        System.out.println(test + " " + test1);
        Integer num = new Integer(50);
        System.out.println(num.hashCode());

        // called the method it did the action without print
        test.startsWith("M");
        // called and printed
        System.out.println(test.startsWith("M"));

        // Do your own methods to count the number of charachters
        String [] chars = {"A", "A", "A", "Y", "C", "D", "Y"};

        System.out.println(counter0());
        // 0 -- calling method return 0

        int numOfChar = counterString(chars, "Y" );
        // 3 if A and 2 if Y

    }

    // Do your own methods which return integer

    public static int counter0(){
        return 0;
    }

    // Method takes Array has some chars and char which we need to count its iterate
    public static int counterString(String[] x, String y){
        //System.out.println(Arrays.toString(x) + " " + y);
        // [A, A, A, Y, C, D, Y] A

        int counterZ = 0;
        for (String z : x){
            if (z == y){
                counterZ++;
            }
        }
        System.out.println(counterZ);
        return counterZ;
        // 3 if A
    }
}
