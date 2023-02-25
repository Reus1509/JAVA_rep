package org.example.seminar4.cw4.task1;

import java.util.Arrays;
import java.util.LinkedList;

public class OddElem {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Integer sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) sum += list.get(i);
        }
        System.out.println("Сумма четных элементов равна: " + sum);
    }
}
