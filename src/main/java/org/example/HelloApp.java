package org.example;

public class HelloApp {
    public static void main(String[] args) {

        // If argument exists → use it, else use "World"
        String name = (args.length > 0) ? args[0] : "World";

        System.out.println("Hello, " + name + "!");
    }
}