package com.geekbrains.HomeWork4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {

    public static final int SIZE = 3;

    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';

    public static char[][] map = new char[SIZE][SIZE];

    public static Scanner SCANNER = new Scanner(System.in);
    public static Random RANDOM = new Random();


    public static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x, y;
        System.out.println("Введите значение в формате X Y");
        do {
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
        printMap();
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = RANDOM.nextInt(SIZE);
            y = RANDOM.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_0;
        System.out.println("PC turn " + x + " " + y);
        System.out.println();
        printMap();
    }

    /**
     * Искусственный интеллект
     * Искуственный интеллект настроил таким образом, что компьютер подставляет в свободную ячейку сначала свой знак,
     * проверяет условие победы, затем знак противника, чтобы проверить может ли победить противник.
     */

    public static boolean smartAi() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    map[i][j] = DOT_0;
                    if (checkWin(DOT_0)) {
                        printMap();
                        return false;
                    }
                    map[i][j] = DOT_X;
                    if (checkWin(DOT_X)) {
                        map[i][j] = DOT_0;
                        printMap();
                        return false;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }
        return true;
    }

    public static boolean isCellValid(int x, int y) {
        if (x >= 0 && y >= 0 && x < SIZE && y < SIZE && map[y][x] == DOT_EMPTY) {
            return true;
        }
        return false;
    }


    public static boolean checkWin(char symbol) {
        int counterHor = 0; //Счетчик совпадений по горизонтали
        int counterVer = 0; //Счетчик совпадений по вертикали
        int counterMainDia = 0; //Счетчик совпадений главной диагонали
        int counterDia2 = 0; //Счетчик совпадений побочной диагонали
        for (int i = 0; i < map.length; i++) {
            counterVer = 0;
            counterHor = 0;
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == symbol) {
                    counterHor++;
                }
                if (map[j][i] == symbol) {
                    counterVer++;
                }
                if (map[i][i] == symbol) {
                    counterMainDia++;
                }
                if (map[i][map.length - i] == symbol) {
                    counterDia2++;
                }
                if (counterHor == 3 || counterVer == 3 || counterMainDia == 3 || counterDia2 == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkDraw() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            if (checkWin(DOT_X)) {
                System.out.println("Human Win");
                break;
            }
            if (checkDraw()) {
                System.out.println("Draw");
                break;
            }
            if (smartAi()) {
                aiTurn();
                if (checkWin(DOT_0)) {
                    System.out.println("PC Win");
                    break;
                }
            }
            if (checkDraw()) {
                System.out.println("Draw");
                break;
            }
        }
    }
}
