package com.geekbrains.HomeWork3;

//7. ** Написать метод, в который передается не пустой одномерный
// целочисленный массив, метод должен вернуть true,
// если в массиве есть место, в котором сумма левой и правой части массива равны.
public class Task7 {
    public static void main(String[] args) {
        int[] currentArray = {3, 7, 7, 5, 5, 7, 10, 4, 3, 3};
        System.out.println(arrayBalance(currentArray));
    }
    //Для решения задачи предлагаю найти сумму всех элементов массива, и разделить ее пополам.
//Таким образом мы найдем точку баланса левой и правой части.
    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

//Далее пробегаемся по элемента массива и смотрим возможно ли набрать эту сумму
// равную половине суммы всей длины массива

    public static boolean arrayBalance(int[] array) {
        int balancePoint = sumOfArray(array) / 2;
        int localPoint = 0;
        for (int i = 0; i < array.length; i++) {
            localPoint += array[i];
            if (localPoint == balancePoint){
                return true;
            }
        }
        return false;
    }
}
