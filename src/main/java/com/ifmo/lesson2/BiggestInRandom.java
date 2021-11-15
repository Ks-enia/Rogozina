package com.ifmo.lesson2;

public class BiggestInRandom {
    /*
     Создать программу, выводящую на экран случайно сгенерированное трёхзначное
     натуральное число и его наибольшую цифру.Примеры работы программы:
     В числе 208 наибольшая цифра 8.
     В числе 774 наибольшая цифра 7.
     В числе 613 наибольшая цифра 6.
     */
    public static void main(String[] args) {
        int rnd = threeDigitRandom();

        String largestDigit = largestDigit(rnd);

        System.out.println(largestDigit);
    }

    public static int threeDigitRandom() {
        // TODO implement
        /*int h = rnd / 100;
        int m = rnd / 10 % 10;
        int l = rnd % 10;
*/

        return 0;
    }

    public static String largestDigit(int rnd) {
        // TODO implement

        int max = 0;

        return "В числе " + rnd + " наибольшая цифра " + max + ".";
    }
}
