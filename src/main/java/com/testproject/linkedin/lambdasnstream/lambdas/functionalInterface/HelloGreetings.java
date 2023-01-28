package com.testproject.linkedin.lambdasnstream.lambdas.functionalInterface;

public class HelloGreetings implements Greeting{


    @Override
    public void sayHello() {
        System.out.println("Hello world");
    }
}
