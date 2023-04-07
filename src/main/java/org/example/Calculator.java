package org.example;

import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = Integer::sum;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    BinaryOperator<Integer> divideFirstVariant = (x, y) -> {
        if (y == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return x / y;
    };
    BinaryOperator<Double> divideSecondVariant = (x, y) -> y == 0 ? Double.POSITIVE_INFINITY : x / y;
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
    Consumer<Double> printlnDouble = System.out::println;
}
