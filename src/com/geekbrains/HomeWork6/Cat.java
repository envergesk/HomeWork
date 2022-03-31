package com.geekbrains.HomeWork6;

public class Cat extends Animal {
    protected String name;
    protected String breed;
    static int counterCat;

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
        counterCat++;
    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            System.out.println(this.name + " пробежал " + 200 + "м");
        } else {
            System.out.println(this.name + " пробежал " + distance + "м");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(this.name + " не умеeт плавать");
    }
}
