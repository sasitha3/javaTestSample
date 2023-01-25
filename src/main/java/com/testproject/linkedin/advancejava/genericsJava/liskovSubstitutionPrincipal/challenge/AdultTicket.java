package com.testproject.linkedin.advancejava.genericsJava.liskovSubstitutionPrincipal.challenge;

public class AdultTicket extends Ticket{

    @Override
    public int getPrice() {
        return 10;
    }

    public String toString() {
        return "Adult Ticket";
    }
}
