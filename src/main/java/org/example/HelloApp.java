package org.example;

public class HelloApp {
    public static void main(String[] args) {

        String names;

        if (args.length > 0) {
            // Join all names with comma
            names = String.join(", ", args);
        } else {
            names = "World";
        }

        System.out.println("Hello, " + names + "!");
    }
}