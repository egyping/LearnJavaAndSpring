package org.amigoscode;

// Abstraction
// This class model extended from the abstract class Websites
public class WebsiteEducation extends Website{
    private String type;

    public WebsiteEducation(String url, String type) {
        super(url);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void websiteType() {
        System.out.println("Educational Websites");
    }
}
