package org.amigoscode;

// Inheritance AnimalDog inherit from parent class  << extends >>
public class AnimalDog extends Animal{
    private String breed;


    public AnimalDog(String name, String breed) {
        // super means leverage the parent class property and pass it to the child
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "AnimalDog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
