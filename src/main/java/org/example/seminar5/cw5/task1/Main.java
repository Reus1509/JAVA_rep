package org.example.seminar5.cw5.task1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Character, Integer> mapChar = new HashMap<>();
        String str = "qwerutio qwe asd dwqo";
        for (int i = 0; i < str.length(); i++) {
            mapChar.putIfAbsent(str.charAt(i), 0);
            mapChar.put(str.charAt(i), mapChar.get(str.charAt(i))+1);
 //           if(mapChar.containsKey(str.charAt(i))){
   //             mapChar.put(str.charAt(i), mapChar.get(str.charAt(i)) + 1);
     //       } else {
       //         mapChar.put(str.charAt(i), 1);
         //   }
        }
        System.out.println("Map = " + mapChar); //обычный вывод
        for (Map.Entry<Character, Integer> entry:mapChar.entrySet() //форматированный вывод
             ) {
            System.out.println(entry.getKey() + " встретилась " + entry.getValue() + " раз.");
        }
    }
}
