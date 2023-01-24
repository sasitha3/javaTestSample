package com.testproject.linkedin.advancejava.functionalProgramming.methodRef;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);

        numbers.forEach((number) -> NumberUtils.evenOrOdd(number));

        //shortest way to write
        numbers.forEach(NumberUtils::evenOrOdd);
    }
}
