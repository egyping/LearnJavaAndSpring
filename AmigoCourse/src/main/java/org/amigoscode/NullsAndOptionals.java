package org.amigoscode;

import java.util.Optional;

public class NullsAndOptionals extends Throwable {

    public static void main(String[] args) {
        // Nulls and Optionals
        // Nulls means there is no value set to the object

        String myName = null;
        System.out.println(myName);
        // null

        //System.out.println(myName.toUpperCase());
        // error NullsAndOptionals since no value

        // To avoid the null errors use IF or Try\Catch == if is better
        if (myName != null) {
            System.out.println(myName.toUpperCase());
        } else {
            System.out.println("The name is null value ");
        }
        // The name is null value

        // Try Catch
        try {
            System.out.println(myName.toUpperCase());
        } catch (NullPointerException e){
            System.out.println("The name is null value ");
        }
        // The name is null value


        // Optionals
        // Great way of dealing with expected null values
        String optionalFahd = null;

        // of when you sure that the value is NOT null
        // Optional.of(optionalFahd);
        // NullsAndOptionals error

        // ofNullable if you are not sure null or not and if null do so and so
        String yassin = "Yassin not Null";
        String optionalYassin = Optional.ofNullable(yassin).orElse("The name is NULL");
        System.out.println(optionalYassin);
        // Yassin not Null

        String yehya = null;
        String optionalYehya = Optional.ofNullable(yehya).map(String::toUpperCase).orElseGet(()-> {
            // any logic
            return "This was Yehya name";
        });
        System.out.println(optionalYehya);
        // This was Yehya name


    }
}
