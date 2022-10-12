package org.amigoscode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Ternary operator possible only in one case
        int age = 25;
        String messageAdul = age >= 18 ? "Ternary operator: I am an Adult" : " I am not adult";
        System.out.println(messageAdul);
        // Ternary operator: I am an Adult

        // switch only in one condition case , for multiple you have to use if
        switch (age){
            case 18:
                System.out.println("I am 18");
            case 20:
                System.out.println("I am 20 ");
            default:
                System.out.println("switch: none of the cases");
            // switch: none of the cases
        }

        // Arrays : 2 is the array size
        // first mention the type of the array and at the end the size
        int [] numbers = new int[2];
                System.out.println(Arrays.toString(numbers));
                // [0, 0]
        boolean [] booleans = new boolean[4];
                System.out.println(Arrays.toString(booleans));
                // [false, false, false, false]

        // Array has numbers -- Arrays size is fixed you cannot modify it
        int [] nums = new int[3];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        System.out.println(nums);
        // memory location you need to use toString
        System.out.println(Arrays.toString(nums));
        // [10, 20, 30]

        // Create arrays with curly bracket easier short
        int [] numCurly = {10 , 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(numCurly));
        // [10, 20, 30]

        // Curly string
        String [] stringCurly = {"Fahd" , "Yassin", "Yomna", "Sara" };
        System.out.println(Arrays.toString(stringCurly));
        System.out.println(stringCurly.length);
        // length is array property
        // [Fahd, Yassin, Yomna]
        // 3

        // Nesting
        int lastNum = numCurly[5];
        System.out.println(lastNum);
        // 60

        // Get the last index
        int lastNumLength = numCurly[numCurly.length -1];
        System.out.println(lastNumLength);
        // 60 and -2 for the last before last -3 ...etc.


        // ++ and -- what they are
        int number = 0;
        number++;
        System.out.println(number);
        // 1 so ++ to add 1 and -- to minus 1

        // another way for addition and minus
        int minus = 10;
        minus -= 6;
        System.out.println(minus);
        // 4 and same for +

        // Better for loop == enhanced for loops
        // loop the arrays values and put it in x then print it one by one
        for (int x : numCurly){
            System.out.println(x);
        }
        // 10 20 30 40 50 60

        // above is the enhanced version of the following
        // (initial value ; comdition ; action after every loop)
        for (int i = 0; i < numCurly.length; i++){
            System.out.println(numCurly[i]);
        }
        // 10 20 30 40 50 60

        // Break and continue within the loop
            for (String s : stringCurly) {
                System.out.println(s);
            }
            // Fahd
            // Yassin
            // Yomna
            // Sara

            for (String s : stringCurly) {
                System.out.println(s);
                break;
            }
            // Fahd

            for (String s : stringCurly) {
                if (s.equals("Yomna")){
                    break;
                }
                System.out.println(s);
            }
            // Fahd
            // Yassin

            // continue simply bypass the next line the action
            for (String s : stringCurly) {
                if (s.startsWith("Y")){
                    continue;
                }
                System.out.println(s);
            }
            // Fahd
            // Sara the continue bypassed Yomna and Yassin


        // while and do while loops
            // while something do the following(s)
            int whileSample = 5;
    //            while (whileSample < 6){
    //                System.out.println(whileSample);
    //            }
            // this is infinite since 5 always less than 6
            while (whileSample < 10){
                System.out.println(whileSample);
                whileSample++;
            }
            // 5 6 7 8 9
            // Do while is do the action at least once then execute the condition
            int doSample = 10;
            do {
                System.out.println(doSample);
                doSample++;
            }
            while (doSample < 10);
            // 10 and stop

        // scanner class to take user input from the console











    }
}