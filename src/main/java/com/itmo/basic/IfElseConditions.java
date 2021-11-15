package com.itmo.basic;

/**
 * Created by xmitya on 09.03.17.
 */
public class IfElseConditions {
    public static void main(String[] args) {
        for (int i = 0; i < 40; i++) {
            if ((i & 1) == 0)
                System.out.println("Even " + i);
        }
    }

    // Java 12 feature
    private static void oldSwitch(String weekDay) {
        // Сохраняем рабочие часы в эту переменную.
        int workdayLen = 0;

        switch (weekDay) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
                // В каждом блоке указываем переменнную и присваиваем
                // ей значение.
                workdayLen = 8;
                break;
            case "Friday":
                workdayLen = 7;
                break;
            case "Saturday":
            case "Sunday":
                workdayLen = 0;
                break;
            default:
                workdayLen = -1;
        }
    }

    private static void switchExpression(String weekDay) {
        // Сохраняем рабочие часы в эту переменную.
        int workdayLen = switch (weekDay) {
            case "Monday", "Tuesday", "Wednesday", "Thursday" -> 8;
            case "Friday" -> 7;
            case "Saturday", "Sunday" -> 0;
            default -> -1;
        };
    }
}
