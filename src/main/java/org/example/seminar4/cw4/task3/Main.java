package org.example.seminar4.cw4.task3;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, -1, 2, -2, 3, -3));
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) < 0) list.remove(i);
        }
        System.out.println(list);
    }
}
