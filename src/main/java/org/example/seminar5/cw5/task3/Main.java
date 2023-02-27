package org.example.seminar5.cw5.task3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.print("Введите число римскими цифрами: ");
        String s = myscanner.nextLine();
        myscanner.close();
        System.out.println(translateNum(s));
    }

    public static int translateNum(String s) {
        Map<Character, Integer> numb = new HashMap<>();
        numb.put('I', 1);
        numb.put('V', 5);
        numb.put('X', 10);
        numb.put('L', 50);
        numb.put('C', 100);
        numb.put('D', 500);
        numb.put('M', 1000);
        Integer num = numb.get(s.charAt(s.length() - 1));
        for (int i = 0; i < s.length()-1; i++) {

            if (numb.get(s.charAt(i + 1)) > numb.get(s.charAt(i))){
                num -= numb.get(s.charAt(i));
            } else num += numb.get(s.charAt(i));
        }
        return num;
    }

}
