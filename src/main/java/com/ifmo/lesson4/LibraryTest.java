package com.ifmo.lesson4;

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library(3);
        System.out.println(library.put(new Book("AAA", "AAA"), 2));
        System.out.println(library.put(new Book("BBB", "BBB"), 2));
        System.out.println(library.put(new Book("CCC", "CCC"), 2));

        System.out.println(library.take(new Book("AAA", "AAA"), -2));
    }
}
