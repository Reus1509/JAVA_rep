package org.example.seminar_2.hw2;

import java.util.Scanner;

public class task2 {
    /**
     * Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
     * Определение 3. Последовательность, в которой каждый последующий член (кроме первого) больше предыдующего, называется возрастающей:
     *
     * @param args
     */
    public static void main(String[] args) {
        library lb = new library();
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Введите количество чисел в последовательности: ");
        int n = library.getInt(), lastNum = 0, num = 0;
        boolean flag = true;

        System.out.println("Введите числа последовательности: ");
        for (int i = 0; i < n; i++) {
            lastNum = num;
            num = library.getInt();
            if (num <= lastNum) {
                flag = false;
            }
        }
        myScanner.close();

        if (!flag) {
            System.out.print("Последовательность не возрастающая");
        } else if (flag) {
            System.out.print("Последовательность возрастающая.");
        } else {
            System.out.print("Что то пошло не так!");
        }
    }
}
