package com.itmo.objects1;

/**
 * Created by xmitya on 19.03.17.
 */
public class Duck extends Bird {
    // Переопределяется родительский метод say().
    @Override
    public void say() {
        System.out.println("Quack-quack!");
    }
}
