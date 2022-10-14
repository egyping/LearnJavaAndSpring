package org.amigoscode;

// Abstraction
// This class is the main class

public class WebsitinAction {

    public static void main(String[] args) {
        // we cannot make object from the abstracted class
        // Website website = new Website()

        WebsiteGaming webGame_1 = new WebsiteGaming("gmae1.com", "Gaming");
        WebsiteEducation webEdu_1 = new WebsiteEducation("edu1.com","Educational");

        System.out.println(webGame_1.getUrl());;
        System.out.println(webGame_1.getType());;
        System.out.println(webEdu_1.getUrl());;
        System.out.println(webEdu_1.getType());;

        // Methods forced from the abstracted class to the classes inherited the abstracted
        webGame_1.websiteType();
        webEdu_1.websiteType();
//        gmae1.com
//        Gaming
//        edu1.com
//        Educational
//        Gaming websites
//        Educational Websites
    }
}
