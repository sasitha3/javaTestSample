package com.testproject.linkedin.advancejava.genericsJava.liskovSubstitutionPrincipal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClothingSite {

    public static void main(String[] args) {
        ShirtItem shirtItem = new ShirtItem();
        ShirtItem shirtItem2 = new ShirtItem();

        List<ShirtItem> clothingItemList = new ArrayList<>();
        clothingItemList.add(shirtItem);
        clothingItemList.add(shirtItem2);
        checkoutAllItem(clothingItemList);
    }
    static void checkoutItem(ClothingItem item) {
        System.out.println("Item purchased: " + item.getName() + ", price: " + item.getPrice());
    }

    static void checkoutAllItem(List<? extends ClothingItem> clothingItem){
        clothingItem.forEach((item)->{
            checkoutItem(item);
        });
    }
}
