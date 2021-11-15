package com.itmo.objects1;


public class ObjectsExample1 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Dog dog = new Dog();
        Cat cat = new Cat();

        duck.fly();
        dog.feed(cat);

        say(duck, dog, cat, new Animal());
    }

    private static void say(Animal... animals) {
        for (Animal animal : animals) {
            animal.say();
        }
    }
}
