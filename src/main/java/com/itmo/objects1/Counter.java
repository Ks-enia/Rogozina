package com.itmo.objects1;

// Класс доступен везде.
public class Counter {
    // Поле cnt инкапсулировано в классе Counter.
    private int cnt;

    // Метод доступен везде.
    public void increment() {
        cnt++;
    }

    // Метод доступен везде.
    public int getValue() {
        return cnt;
    }
}
