package org.amigoscode;

// Learn classes
// Class is the skeleton of SOMETHING so you create objects from the class
// Here is the Car class and the objects will be at CarInnAction
// ususally the skeleton class has no main method - of course as we dont execute it we execute the class
// which access the skeleton
public class Car {

    // You start with the model variable of the class
    private String color;
    private int make;
    private boolean sedan;

    // Set the actual behavior of the model by adding setter and getter
    // ctrl + enter and select setter and getter
    // setter helps yu to call to use the class and set\change the class object
    // getter same like setter but only to call the class properties
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMake() {
        return make;
    }

    public void setMake(int make) {
        this.make = make;
    }

    public boolean isSedan() {
        return sedan;
    }

    public void setSedan(boolean sedan) {
        this.sedan = sedan;
    }
}
