package org.amigoscode;

// Abstraction
// the main class is abstracted means: you will not create object from the main class
// the main class role limited to have the shared MANDATORY properties and methods
// Website main abstracted class must have website url and method to print out the website type
abstract public class Website {
    private String url;

    public Website(String url) {
        this.url = url;
    }

    // Method which force the child classes to implement
    // Mehthod without implementation in the abstracted class ONLY at the child classes
    public abstract void websiteType();

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Website{" +
                "url='" + url + '\'' +
                '}';
    }
}
