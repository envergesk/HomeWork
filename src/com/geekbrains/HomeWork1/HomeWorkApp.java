package com.geekbrains.HomeWork1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        checkColor();
        compareNumbers();
    }

    private static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign(){
        int a = 5;
        int b = -6;
        if (a + b >= 0){
            System.out.println("Сумма положительная");
        }else{
            System.out.println("Сумма отрицательная");
        }
    }

    private static void checkColor(){
        int value = 55;
        if (value <= 0){
            System.out.println("Красный");
        }else if(0 < value && value <= 100){
            System.out.println("Желтый");
        }else{
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers(){
        int a = 6;
        int b = 7;
        if(a >= b){
            System.out.printf("a >= b");
        }else{
            System.out.printf("a < b");
        }
    }
}
