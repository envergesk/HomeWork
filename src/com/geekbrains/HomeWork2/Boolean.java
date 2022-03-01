package com.geekbrains.HomeWork2;

public class Boolean {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(aBoolean(5, 11));
        typeNumber(7);
        System.out.println(typeNumber2(6));
        sumOfString("hi", 7);
        System.out.println(typeOfYear(2021));

    }

    public static void sumOfString(String a, int b){
        for(int i = 0; i < b; i++){
            System.out.println(a);
        }
    }


    public static boolean aBoolean (int a, int b){
        return ((a + b) >= 10) && ((a + b) <= 20);
    }

    public static void typeNumber(int a){
        if(a >= 0){
            System.out.println("Число положительное");
        }else{
            System.out.println("Число отрицательное");
        }
    }

    public static boolean typeNumber2(int a){
        return (a < 0);
    }


    public static boolean typeOfYear(int a){
        /*if(a % 400 == 0) return true;
        else if(a % 4 == 0 && a % 100 != 0) return true;
        else return false;*/
        return ((a % 400 == 0) || (a % 4 == 0 && a % 100 != 0));
    }


}
