package com.itmo.objects1;

/**
 * Created by xmitya on 19.03.17.
 */
public class Mammal extends Animal {
    // Переопределяется родительский метод say().
    @Override
    public void say() {
        System.out.println("I'm a mammal!");
    }

    // Новый метод, специфичный для млекопитающих.
    public void feed(Mammal mammal) {
        System.out.println("Feeding other mammal with a milk " + mammal);
    }
}
