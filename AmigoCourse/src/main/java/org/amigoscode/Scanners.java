package org.amigoscode;
import java.time.LocalDate;
import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {

        // take object from the Scanner class and assign it to the scanner variable
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your good name? ");

        // anywhere you will refer scanner.nextLine() it will prompt the user to input
        // as it consider one of the class ACTIONS between the code
        String userName = scanner.nextLine();
        System.out.println("Helloo" + "  "+  userName);
        //  Fahd from -- the class actions
        //  Helloo Fahd -- from sout

        System.out.println("What is your age?");
        int age = scanner.nextInt();
        int birthYear = LocalDate.now().getYear() - age;
        System.out.println(birthYear);

        if (age >= 18){
            System.out.println("You are Adult");
        } else {
            System.out.println("You are not adult yet!");
        }


    }
}
