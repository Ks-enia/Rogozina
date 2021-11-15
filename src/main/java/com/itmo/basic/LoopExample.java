package com.itmo.basic;

import java.util.Scanner;

/**
 * Created by xmitya on 11.03.17.
 */
public class LoopExample {
    public static void main(String[] args) {
        outer: // Метка.
        for (int k = 0; k < 3; k++) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.println(i + "" + j);

                    if ((i + j + 1) % 15 == 0) {
                        System.out.println("STOP!");
                        break outer;
                    }
                }
            }
        }

    }

    private static void labels() {
        int cnt = 0;

        for (int i = 1; i <= 50000; i++) {
            for (int j = i; j > 0; j /= 10) {
                if (j % 10 == 2) {
                    cnt++;

                    break;
                }
            }
        }

        System.out.println(cnt);
    }

    public static int wrongLabels(){
        int result = 0;
        int[] digits = new int[5];

        for (int i = 1; i <= 50000; i++) {
            digits[0] = i / 10000;
            digits[1] = (i / 1000) % 10;
            digits[2] = (i / 100) % 10;
            digits[3] = (i / 10) % 10;
            digits[4] = i % 10;
            for (int j = 0; j < digits.length; j++) {
                if (digits[j] == 2) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }

    private static void tickets() {
        int cnt = 0;

        for (int i = 0; i < 1000; i++) {
            int sum = sum(i);

            for (int j = 0; j < 1000; j++) {
                if (sum == sum(j))
                    cnt++;
            }
        }

        System.out.println(cnt - 1);
        System.out.println(luckyTickets());
    }

    private static int sum(int num) {
        return num % 10 + num / 10 % 10 + num / 100;
    }

    public static int luckyTickets(){
        int[] array = new int[28];
        int d1, d2, d3, sum, result = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        for (int i = 0; i <= 999; i++) {            // counting number of ways to get sum
            d1 = i / 100;                           // 001 - sum = 1
            d2 = (i / 10) % 10;                     // 010 - sum = 1
            d3 = i % 10;                            // 100 - sum = 1
            sum = d1 + d2 + d3;                     // total: 3 ways to get this sum
            array[sum]++;
        }
        for (int i = 0; i < array.length; i++) {    // counting number of lucky tickets
            result += array[i] * array[i];
        }
        result--;                                   // '000000' - don't exist, so need to decrement 'result' by one
        return result;
    }
}
