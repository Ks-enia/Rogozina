package com.ifmo.lesson3;

import java.util.Random;

public class TwoArrays {
    /*
     Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите
     массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов
     каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо
     сообщите, что их средние арифметические равны).
     */
    public static void main(String[] args) {
        int[] randomNumbers1 = randomNumbers();
        int[] randomNumbers2 = randomNumbers();

        printNumbers(randomNumbers1);
        System.out.println();
        printNumbers(randomNumbers2);

        int average1 = average(randomNumbers1);
        int average2 = average(randomNumbers2);

        if (average1 > average2) {
            System.out.println("\nДля массива " + 1 + " среднее арифметическое больше.");
        } else if (average1 == average2) {
            System.out.println("Их средние арифметические равны.");
        } else {
            System.out.println("\nДля массива " + 2 + " среднее арифметическое больше.");
        }
    }

    public static int[] randomNumbers() {
        int[] arr = new int[5];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(6);
        }

        return arr;
    }

    public static int average(int[] randomNumbers) {
        int sum = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            sum = sum + randomNumbers[i];
        }

        return sum / randomNumbers.length;
    }

    public static void printNumbers(int[] randomNumbers) {
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
        }
    }
}
