package com.geekbrains.HomeWork3;

// 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
public class Task6 {
    public static void main(String[] args) {
        int[] array = {6, 7, 3, 44, 77, 234, 55, 22, 6, 4};
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальное значение в массиве = " + min);
        System.out.println("Максимальное значение в массиве = " + max);
    }
}
