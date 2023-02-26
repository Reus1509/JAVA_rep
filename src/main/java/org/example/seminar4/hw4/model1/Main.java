package org.example.seminar4.hw4.model1;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        Iterator<Integer> iterator = linkedList.iterator();
        Iterator<Integer> backIterator = linkedList.descendingIterator();

        System.out.println("Стартовые данные: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next() + "->");
        }
        System.out.println("null");

        System.out.println("Итог: ");
        while (backIterator.hasNext()) {
            System.out.print(backIterator.next() + "->");
        }
        System.out.printf("null");
    }
}
