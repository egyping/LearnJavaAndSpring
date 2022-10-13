package org.amigoscode;

// This is the class which will make use of the Car class
// this class must have psvm
// here we will create the car objects
public class CarInnAction {

    public static void main(String[] args) {
        // create object from the class
        // bmw is instance of the car class -- instantiation
       // Car bmw = new Car(); object creation before constructor
       Car bmw = new Car("White", 2015, true); // create onject after constructor
       Car toyota = new Car("black");
       // set and get the object the way you want -- using the model class setter and getter
       // We used the setter to make it red since the class has no constructor yet

       // default constructor toyota
        System.out.println("Default constructor");
        System.out.println(toyota.getColor());
        System.out.println(toyota.getMake());
        System.out.println(toyota.isSedan());

        // BMW used the original constructor which you have to define the fields while creating the object
        System.out.println("Normal constructor which require to mention the fields ");
        System.out.println(bmw.getColor()); //White
        System.out.println(bmw.getMake()); //2015
        System.out.println(bmw.isSedan());


        System.out.println("toString to print our the object  ");
        System.out.println(bmw);
        // this is without toString at the class org.amigoscode.Car@36baf30c
        // after adding the toString to the original class
        // Car{color='White', make=2015, sedan=true}



    }
}
