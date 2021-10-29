package com.ifmo.lesson5;

public class Accumulator {
    private int value;
    private Operation op;


    {}

    public int getValue() {
        return value;
    }




    public Accumulator(int startvalue, Operation op) {
        this.value = startvalue;
        this.op = op;
    }
    public int getvalue() {
        return value;

    }
    //public void accumulate (int a) {

    public void accumulate(int a) {
        value = op.calculate(value , a);

    }




    }
