package com.testproject.linkedin.advancejava.functionalProgramming.functionalInterface;

public class GreetingMorningImpl implements Greeting {
    @Override
    public void printMessage() {
        System.out.println("Good morning");
    }
}
