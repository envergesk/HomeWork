package com.geekbrains.HomeWork7;

public class Plate {
    protected int food;

    //Constructor
    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Количество еды в миске " + food);
    }

    public void decreaseFood(int food) {
        if (this.food - food >= 0) {
            this.food = this.food - food;
        } else {
            System.out.println("В миске недосточно еды");
        }
    }

    public boolean enoughFood(int appetite) {
        if (food - appetite >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public void addFood(int food){
        this.food += food;
        System.out.println("В миску добавили " + food + " еды");
    }

}
