package com.testproject.linkedin.advancejava.functionalProgramming.functionalInterface;

public class Main {

    public static void main(String[] args) {
        GreetingImpl greeting = new GreetingImpl();
        greeting.printMessage();
        GreetingMorningImpl greetingMorning = new GreetingMorningImpl();
        greetingMorning.printMessage();
        Greeting greetingAfternoon = () -> System.out.println("Good afternoon");
        greetingAfternoon.printMessage();
    }
}
