package com.geekbrains.HomeWork6;

public class HomeWork6 {
    public static void main(String[] args) {
        Dog vega = new Dog("Vega", "Shepperd");
        Dog prema = new Dog("Premier", "Dalmatian");

        Cat pushok = new Cat("Pushok","Angorian");
        Cat lyolik = new Cat("Lyolik", "Noblecat");

        vega.swim(7);
        prema.run(127);

        pushok.swim(22);
        lyolik.run(12);

        System.out.println("Количество созданных животных: " + (Dog.counterDog + Cat.counterCat));
    }
}
