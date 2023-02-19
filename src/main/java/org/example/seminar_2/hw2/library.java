package org.example.seminar_2.hw2;

import java.util.Scanner;

public class library {
    public static void main(String[] args) {

    }

    /**
     * Ввод пользователя с проверкой на число.
     *
     * @return
     */
    public static int getInt() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Вы ввели не число, введите пожалуйста целое число!");
            sc.next();
        }
        return sc.nextInt();
    }

    public static void printArray(int arrSize, int[] arr) {
        for (int i = 0; i < arrSize; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
