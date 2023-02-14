package com.testproject.linkedin.advancejava.genericsJava.liskovSubstitutionPrincipal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ClothingSite {

    public static void main(String[] args) {
//        ShirtItem shirtItem = new ShirtItem();
//        ShirtItem shirtItem2 = new ShirtItem();
//
//        List<ShirtItem> clothingItemList = new ArrayList<>();
//        clothingItemList.add(shirtItem);
//        clothingItemList.add(shirtItem2);
//        checkoutAllItem(clothingItemList);
        List<Integer> arr = Arrays.asList(5,2,4,8,6);
        miniMaxSum(arr);
    }
    static void checkoutItem(ClothingItem item) {
        System.out.println("Item purchased: " + item.getName() + ", price: " + item.getPrice());
    }

    static void checkoutAllItem(List<? extends ClothingItem> clothingItem){
        clothingItem.forEach((item)->{
            checkoutItem(item);
        });
    }

    public static void miniMaxSum(List<Integer> arr) {
        long minCount = 0;
        long maxCount = 0;
        for (Integer number: arr.stream().sorted().skip(1).collect(Collectors.toList())) {
            maxCount = maxCount + number;
        }
        for (Integer number: arr.stream().sorted(Comparator.reverseOrder()).skip(1).collect(Collectors.toList())) {
            minCount = minCount + number;
        }
        System.out.println(minCount);
        System.out.println(maxCount);
    }
}
