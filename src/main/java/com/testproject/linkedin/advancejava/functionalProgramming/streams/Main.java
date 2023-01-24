package com.testproject.linkedin.advancejava.functionalProgramming.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "banana", "pineapple", "pear", "strawberry", "blueberry");
        List<String> capitalisedFruit = processWithoutStreams(fruits); //without streams
        List<String> capitalisedFruitStream = processWithStreams(fruits);// with streams
        System.out.println(capitalisedFruit);
        System.out.println(capitalisedFruitStream);
    }

    static List<String>  processWithoutStreams(List<String> fruits) {
        List<String> capitalisedFruit = new ArrayList<>();
        for (String item : fruits) {

            item = item.toUpperCase();
            if (item.startsWith("P")) {
                capitalisedFruit.add(item);
            }
        }

        Collections.sort(capitalisedFruit, Collections.reverseOrder());
        return capitalisedFruit;
    }

    static List<String> processWithStreams(List<String> fruits) {
        return fruits.stream()
                .map(String::toUpperCase)
                .filter(item -> item.startsWith("B"))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }
}
