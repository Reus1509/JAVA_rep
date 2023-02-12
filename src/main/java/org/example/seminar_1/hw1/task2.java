package org.example.seminar_1.hw1;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.print("Введите последовательность чисел через пробел: ");
        Scanner myScanner = new Scanner(System.in);
        try{
            String numText = myScanner.nextLine();
            String [] myArray = numText.split(" ");
            int result = 0;
            for (int i = 0; i < myArray.length; i++) {
                if(Integer.parseInt(myArray[i]) < 0){
                    result += Integer.parseInt(myArray[i - 1]);
                }
            }
            System.out.print("Результат: " + result);
        }
        finally {
            if(myScanner != null) myScanner.close();
        }

    }
}
