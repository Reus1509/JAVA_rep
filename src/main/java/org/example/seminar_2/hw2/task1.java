package org.example.seminar_2.hw2;

import java.util.Scanner;

public class task1 {
    /**
     * Дана последовательность N целых чисел. Найти сумму простых чисел.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Введите количество чисел в последовательности: ");
        int n = myScanner.nextInt();
        int summ = 0;
        System.out.println("Введите числа последовательности: ");
        for (int i = 0; i < n; i++) {
            int num = myScanner.nextInt();
            if (num == 1) {
                summ = summ;
            } else if (num == 2 || num == 3 || num == 5 || num == 7) {
                summ += num;
            } else if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0) {
                summ += num;
            }
        }
        myScanner.close();
        System.out.print("Сумма простых чисел данной последовательности равна:" + summ);
    }
}
