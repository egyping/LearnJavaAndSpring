package org.amigoscode;

// Inheritance
public class AnimalinAction {
    public static void main(String[] args) {
        Animal animal = new Animal("Rocky");
        AnimalDog dog = new AnimalDog("Jacky", "Doberman");

        System.out.println(animal.getName());
        // Rocky
        System.out.println(dog.getName() + " "+ dog.getBreed());
        // Jacky Doberman -- Jacky string name inherited from Animal
    }
}
