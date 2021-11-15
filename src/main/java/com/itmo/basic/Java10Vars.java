package com.itmo.basic;

public class Java10Vars {
    public static void main(String[] args) {
        var myString = "My string";
        // Будет скомпилировано в
        // String myString = "My string";

        var count = 10;
        // Будет скомпилировано в
        // int count = 10;

        var price = 9.99;
        // Будет скомпилировано в
        // double price = 9.99;

        var var = 42;
        // Будет скомпилировано в
        // int var = 42;
    }
}
