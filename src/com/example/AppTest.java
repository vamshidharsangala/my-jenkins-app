package com.example;

public class AppTest {

    public static void main(String[] args) {

        System.out.println("Running Unit Tests...");

        if (App.add(5, 10) == 15) {

            System.out.println("Test Passed!");

        } else {

            System.out.println("Test Failed!");

            System.exit(1);
        }
    }
}