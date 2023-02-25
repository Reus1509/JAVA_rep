package org.example.seminar4.cw4.task2;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
        Integer sumOfEvenElem = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 != 0) sumOfEvenElem += list.get(i);
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 3 != 0) list.set(i, sumOfEvenElem);
        }
        for (int elem:list
             ) {
            System.out.printf("%d ", elem);
        }
    }
}
