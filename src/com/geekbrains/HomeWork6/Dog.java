package com.geekbrains.HomeWork6;

public class Dog extends Animal {
    protected String name;
    protected String breed;
    static int counterDog;


    //Constructor
    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
        counterDog++;
    }
    @Override
    public void run(int distance) {
        if (distance > 500) {
            System.out.println(this.name + " пробежал " + 500 + "м");
        } else {
            System.out.println(this.name + " пробежал " + distance + "м");
        }

    }

    @Override
    public void swim(int distance) {
        if (distance > 10) {
            System.out.println(this.name + " проплыл " + 10 + "м");
        } else {
            System.out.println(this.name + " проплыл " + distance + "м");
        }
    }
}
