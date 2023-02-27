package org.example.seminar5.hw5.model1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountInWords {
    public static void main(String[] args) {
        System.out.print("Введите выражение: ");
        Scanner myscanner = new Scanner(System.in);
        String text = myscanner.nextLine();
        myscanner.close();
        text = text.replaceAll("[-|–|—]|\\p{Punct}", " ");
        while (text.contains("  ")) {
            text = text.replace("  ", " ");
        }
        String[] arrayText = text.split(" ");

        Map<String, Integer> map = getCountWords(arrayText);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static Map<String, Integer> getCountWords(String[] array) {
        Map<String, Integer> map = new HashMap<>();

        for (String current : array) {
            int count = map.getOrDefault(current.toLowerCase(), 0);
            map.put(current.toLowerCase(), ++count);
        }
        return map;
    }
}
