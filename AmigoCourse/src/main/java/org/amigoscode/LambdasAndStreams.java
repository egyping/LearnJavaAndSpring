package org.amigoscode;

import java.util.Random;

public class LambdasAndStreams {
    public static void main(String[] args) {

        // Lambdas and streams ==> Linkedin
        // https://www.linkedin.com/learning/java-lambdas-and-streams/using-lambdas?autoSkip=true&autoplay=true&resume=false
        // https://github.com/LinkedInLearning/java-lambdas-streams-2453107

        // Lambdas sample
            // First way of implementing interface
            // 1- you create interface which has single method work as interface (LambdasGreetingInt)
            // 2- create class extends the interface and you write the business here (LambdasGreetingClass)
            // 3- run the code
            // To run sayHello Interface you need object -- interface object = new ClassExtendedTheInterface
            LambdasGreetingInt greeting = new LambdasGreetingClass();
            greeting.sayHello();
            //Hello from the SayHello Interface

            // Another way for implementing interface is to have the LambdasGreetingClass here only
            // without creating class LambdasGreetingClass
            LambdasGreetingInt greetingII = new LambdasGreetingInt() {
                @Override
                public void sayHello() {
                    System.out.println("Hello From the second method without class ");
                }
            };
            greetingII.sayHello();
            // Hello From the second method of creating interface

            // Using lambdas to shortcut the above
            LambdasGreetingInt greetingLambdas = () -> System.out.println("Hello from lambdas");
            greetingLambdas.sayHello();
            // Hello from lambdas -- that set -- () you can pass parameters

            // What if the lambdas has multiple lines and the interface takes two parameters
            // for example interface takes two integers and return random number for example
            LambdasCalculatorINT generateRandom = (int x, int y) -> {
                Random random = new Random();
                int randomNum = random.nextInt(40);
                return x * y + randomNum;
            };
            System.out.println(generateRandom.calculator(4, 5));;
            // 52 every execute different number

            // use existing Java interfaces
            // in the last sample we had to create Interface takes two integers
            // java has pre made interfaces ready to use to save your time
            // java.util.function https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
            // this package came to help in writing lambdas since lambdas is headless, lambda came to write the logic


    }
}
