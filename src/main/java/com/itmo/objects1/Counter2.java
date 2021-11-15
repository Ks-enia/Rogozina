package com.itmo.objects1;

/**
 * Created by xmitya on 19.03.17.
 */
public class Counter2 extends Counter {
    // Переопределение родительского метода.
    @Override
    public void increment() {
        super.increment();
        super.increment();
    }

    // Перегруз метода increment().
    public void increment(int times) {
        for (int i = 0; i < times; i++) {
            super.increment();
        }
    }

    // Перегруз метода increment().
    public void increment(long times) {
        for (long i = 0; i < times; i++) {
            super.increment();
        }
    }
}
