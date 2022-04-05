package com.geekbrains.HomeWork7;

public class Cat {
    protected String name;
    protected int appetite;
    protected boolean satiety;

    //Constructor
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }

    public void eat(Plate p) {
        if (p.enoughFood(appetite)) {
            p.decreaseFood(appetite);
            satiety = true;
        } else {
            System.out.println("В миске недотаточно еды");
            System.out.println(this.name + " остался голодным");
            satiety = false;
        }
    }
}
