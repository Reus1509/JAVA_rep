package org.example.seminar_2.hw2;

import java.util.Scanner;

public class task3 {
    /**
     * Дан массив целых чисел.
     * Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
     *@param args
     */
    public static void main(String[] args) {
        library lb = new library();
        System.out.print("Введите размер массива: ");

        int numLength = 0, summ = 0, arrSize = library.getInt();
        int[] arr = new int[arrSize];

        System.out.print("Введите числа массива: ");

        for (int i = 0; i < arrSize; i++) {
            arr[i] = library.getInt();
            numLength = String.valueOf(arr[i]).length();
            if(numLength > 2) {
                System.out.println("Нужно ввести максимум двухзначное число!");
                System.out.print("Введите число: ");
                arr[i] = library.getInt();
            }
        }

        library.printArray(arrSize, arr);

        for (int i = 0; i < arrSize; i++) {
            numLength = String.valueOf(arr[i]).length();
            if (numLength == 2 && arr[i] > 0) {
                summ += i;
                System.out.printf("---%d--- ", summ);
            }
        }

        for (int i = 0; i < arrSize; i++) {
            if (arr[i] < 0) {
                arr[i] = summ;
            }
        }

        library.printArray(arrSize, arr);
    }
}
