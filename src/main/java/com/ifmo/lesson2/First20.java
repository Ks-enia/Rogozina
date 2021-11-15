package com.ifmo.lesson2;

public class First20 {
    /*
     Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8
     16 32 64 128 ….
     */
    public static void main(String[] args) {
        // TODO implement

        int element = 2;
        System.out.println(element);
        int[] elements = new int[20];
        elements[0] = element;
        for (int i = 1; i < elements.length; i++) {
            elements[i] = elements[i - 1] * 2;
            System.out.println(elements[i]);
        }
    }
}
