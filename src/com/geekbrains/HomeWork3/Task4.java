package com.geekbrains.HomeWork3;

import java.util.Arrays;

/* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов
равны, то есть [0][0], [1][1], [2][2], …, [n][n]; */

public class Task4 {
    public static void main(String[] args) {
        int[][] array = new int[7][7];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
                if (j == (array.length - 1 - i)) {
                    array[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
