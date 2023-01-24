package com.testproject.linkedin.advancejava.genericsJava.genericMethods;

import java.util.Arrays;
import java.util.List;

public class GenericMethods {

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "pear"};
        Integer[] numbers = {1,5,7};
        Double[] doubleNumbers = {1.2,5.5,7.3};
        List<String> wordList = convertArrayToList(words);
        List<Integer> numberList = convertNumberArrayToList(numbers);
        List<Double> doubleNumberList = convertNumberArrayToList(doubleNumbers);
        System.out.println(wordList);
        System.out.println(numberList);
        System.out.println(doubleNumberList);
    }

    private static <T> List<T> convertArrayToList(T[] array){
        return Arrays.asList(array);
    }

    private static <T extends Number> List<T> convertNumberArrayToList(T[] array){
        return Arrays.asList(array);
    }
}
