package org.amigoscode;

import java.io.FileWriter;

public class ExceptionsInAction {
    public static void main(String[] args) {
        // Dealing with EXCEPTIONS
        // Main concept is if the code has something wrong we need to compile it and run it 

        // checked exception which can be cured by Try\Catch or throws
        // checked exceptions will share message or the error but it will conntinue with the compile
        String name1 = null;
//        System.out.println(name1.length());
        // NullPointerException error

        try {
            System.out.println(name1.length());
        } catch (NullPointerException e){
            System.out.println("The string is null ");
            // one option to print whatever you want The string is null
            e.printStackTrace();
            // another option this will print the exact error at the compile time
//            java.lang.NullPointerException: Cannot invoke "String.length()" because "name1" is null
//            at org.amigoscode.ExceptionsInAction.main(ExceptionsInAction.java:13)
        }

        // unchecked exceptions
        // it stop the compilation it will stop the compilation
            // FileWriter file = new FileWriter("src/exception.txt");
        // java: unreported exception java.io.IOException; must be caught or declared to be thrown
        // above line will cause error enforced by the IDE to fix redline under FileWriter
        // you need to use try and catch or throw to compile

        //case where unchecked exceptions will not stop
        try {
            var number = 18 / 0; // which is not possible in math
        } catch (ArithmeticException e){
            System.out.println("Not possible in math");
        }
        // Not possible in math
        // now you handled even the none forced by IDE unchecked exceptions

    }
}
