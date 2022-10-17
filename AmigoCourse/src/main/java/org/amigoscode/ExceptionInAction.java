package org.amigoscode;

public class ExceptionInAction {
    public static void main(String[] args) {
        // Exception
        // to by pass any error
        String name1 = null;
        // System.out.println(name1.length());
        // this will cause NullPointerException error

        try {
            System.out.println(name1.length());
        }  catch (
                Exception e)
        {
            System.out.println("Error the value is null"+ e);
        }
        // Error the value is nulljava.lang.NullPointerException: Cannot invoke "String.length()" because "name1" is null


    }
}
