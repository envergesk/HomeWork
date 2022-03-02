package com.geekbrains.HomeWork3;
// 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
// и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayCompile(7,8)));

    }
    public static int[] arrayCompile(int len, int initialValue){
        int[] newArray = new int[len];
        for (int i = 0; i < len; i++) {
            newArray[i] = initialValue;

        }
        return newArray;
    }
}
