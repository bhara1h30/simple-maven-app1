package com.example;

public class App {

    // Business Logic Method
    public int add(int a, int b) {
        return a + b;
    }

    // Optional main method
    public static void main(String[] args) {
        App app = new App();
        System.out.println("Sum: " + app.add(2, 3));
    }
}
