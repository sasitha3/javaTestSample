package com.testproject.linkedin.lambdasnstream.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer[] scores = new Integer[]{80, 66, 73, 92, 43};

        Stream<Integer> scoresStream = Arrays.stream(scores);
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("bread");
        shoppingList.add("pineapple");
        shoppingList.add("milk");
        shoppingList.add("pasta");
        Stream<String> shopingListStream = shoppingList.stream();
        shopingListStream.sorted()
                .map(item -> item.toUpperCase())// create a new object rather than modify existing one
                .filter(item -> item.startsWith("P") | item.startsWith("p"))
                .forEach(s -> System.out.println(s));//streams can only use once


        Stream<String> letterStream = Stream.of("a", "b", "c");



    }
}
