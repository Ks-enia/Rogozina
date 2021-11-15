package com.itmo.objects1;

/**
 * Created by xmitya on 19.03.17.
 */
public class Bird extends Animal {
    // Переопределяется родительский метод say().
    @Override
    public void say() {
        System.out.println("I'm a bird!");
    }

    public void fly() {
        System.out.println("I'm flying!");
    }
}
