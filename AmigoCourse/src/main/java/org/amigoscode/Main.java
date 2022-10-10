package org.amigoscode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Ternary operator possible onlyin one case
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
        int [] numCurly = {10 , 20, 30};
        System.out.println(Arrays.toString(numCurly));
        // [10, 20, 30]

        // Curly string
        String [] stringCurly = {"Fahd" , "Yassin", "Yomna" };
        System.out.println(Arrays.toString(stringCurly));
        System.out.println(stringCurly.length);
        // length is array property
        // [Fahd, Yassin, Yomna]
        // 3


    }
}