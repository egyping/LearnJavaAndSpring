package org.example;

import java.time.LocalDate;
import java.util.Locale;

public class PassByValVsRef {
    public static void main(String[] args) {
        
    }
    public static void main(String[] args){
        int x = 0;
        var name = "yehya";

        incrementValue(x);
        System.out.println(x);

        LocalDate now =
    }

    static void incrementValue(int value){
        value++;
    }
}
