package com.itmo.objects1;

/**
 * Created by xmitya on 19.03.17.
 */
public class Cat extends Mammal {
    // Переопределяется родительский метод say().
    @Override
    public void say() {
        System.out.println("Meow!");
    }
}
