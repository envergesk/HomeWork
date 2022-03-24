package com.geekbrains.HomeWork3;

import java.util.Arrays;

//8. *** Написать метод, которому на вход подается одномерный массив и число n
// (может быть положительным, или отрицательным), при этом метод должен сместить
// все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи
// нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) ->
// [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
// При каком n в какую сторону сдвиг можете выбирать сами.
public class Task8 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9};
        int step = -22;
        test(arr, step);
    }

    public static void test(int[] arr, int step) {
        int initialIndex = 0;
        int currentIndex = 0;
        int currentValue = arr[0];
        int counter = 0;
        int stepMethod = step % arr.length;
        while (counter < arr.length) {
            if (stepMethod < 0){
                if (currentIndex == initialIndex && counter != 0) {
                    currentIndex--;
                    if (currentIndex < 0){
                        currentIndex = arr.length + currentIndex;
                    }
                    initialIndex--;
                    if (initialIndex < 0){
                        initialIndex = arr.length + initialIndex;
                    }
                    currentValue = arr[currentIndex];
                }
                currentIndex = (currentIndex + stepMethod) % arr.length;
                if (currentIndex < 0){
                    currentIndex = arr.length + currentIndex;
                }
                int currentNumber = arr[currentIndex];
                arr[currentIndex] = currentValue;
                currentValue = currentNumber;
                counter++;
            }
            else{
                if (currentIndex == initialIndex && counter != 0) {
                    currentIndex++;
                    initialIndex++;
                    currentValue = arr[currentIndex];
                }
                currentIndex = (currentIndex + stepMethod) % arr.length;
                int currentNumber = arr[currentIndex];
                arr[currentIndex] = currentValue;
                currentValue = currentNumber;
                counter++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }

}
