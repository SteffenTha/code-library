package com.example.lambdas;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeDemo {

    public static void main(String[] args) {

        // Imperative ("How to do")
        int sumOfEvensImperative = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sumOfEvensImperative += i;
            }
        }
        System.out.println("===> Result Imperative: " + sumOfEvensImperative);

        // Declarative ("What to do") --> simpler, Thread-safe bc immutable
        int sumOfEvensDeclarative = IntStream
                .rangeClosed(0, 100)
                .filter(i -> i % 2 == 0)
                .reduce((x, y) -> x + y)
                .getAsInt();

        System.out.println("===> Result Declarative: " + sumOfEvensDeclarative);
    }
}
