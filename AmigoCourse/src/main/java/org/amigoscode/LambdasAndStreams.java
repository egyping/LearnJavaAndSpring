package org.amigoscode;

public class LambdasAndStreams {
    public static void main(String[] args) {

        // Lambdas and streams ==> Linkedin
        // https://www.linkedin.com/learning/java-lambdas-and-streams/using-lambdas?autoSkip=true&autoplay=true&resume=false
        // https://github.com/LinkedInLearning/java-lambdas-streams-2453107

        // Lambdas sample
            // First way of implementing interface
            // 1- you create interface which has single method work as interface (LambdasGreeting)
            // 2- create class extends the interface and you write the business here (LambdasGreetingClass)
            // 3- run the code
            // To run sayHello Interface you need object -- interface object = new ClassExtendedTheInterface
            LambdasGreeting greeting = new LambdasGreetingClass();
            greeting.sayHello();
            //Hello from the SayHello Interface

            // Another way for implementing interface is to have the LambdasGreetingClass here only
            // without creating class LambdasGreetingClass
            LambdasGreeting greetingII = new LambdasGreeting() {
                @Override
                public void sayHello() {
                    System.out.println("Hello From the second method of creating interface");
                }
            };
            greetingII.sayHello();
            // Hello From the second method of creating interface

            // Using lambdas to shortcut the above
            LambdasGreeting greetingLambdas = () -> System.out.println("Hello from lambdas");
            greetingLambdas.sayHello();
            // Hello from lambdas -- that set -- () you can pass parameters

    }
}
