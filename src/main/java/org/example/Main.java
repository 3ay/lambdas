package org.example;

public class Main {
    public static void main(String[] args) {
        //Задача 1: Калькулятор
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        //int c = calc.divideFirstVariant.apply(a, b);
        //calc.println.accept(c);
        double d = calc.divideSecondVariant.apply((double) a, (double) b);
        calc.printlnDouble.accept(d);
        //Задача 2: Работяга
        Worker.OnTaskDoneListener doneCallback = System.out::println;
        Worker.OnTaskErrorListener errorCallback = System.err::println;
        Worker worker = new Worker(doneCallback, errorCallback);
        worker.start();
    }
}