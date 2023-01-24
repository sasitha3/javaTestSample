package com.testproject.linkedin.advancejava.genericsJava.liskovSubstitutionPrincipal;

public class JacketItem extends ClothingItem{
    @Override
    int getPrice() {
        return 25;
    }

    @Override
    String getName() {
        return "Jacket";
    }
}
