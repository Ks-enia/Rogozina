package com.ifmo.lesson5;

public class Main {
    public static void main(String[] args) {
        Accumulator acc = new Accumulator(4, new Squareroot());
        acc.accumulate(2);
//        acc.accumulate(5);

        System.out.println(acc.getValue());

    }
}
