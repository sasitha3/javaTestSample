package com.testproject.linkedin.advancejava.genericsJava.liskovSubstitutionPrincipal.challenge;

public class ChildTicket extends Ticket{

    @Override
    public int getPrice() {
        return 5;
    }

    public String toString() {
        return "Child Ticket";
    }
}
