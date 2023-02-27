package org.example.seminar5.cw5.task2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isDouble(arr));
    }

    public static boolean isDouble(int [] arr){
        Map<Integer, Integer> mapList = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (mapList.containsKey(arr[i])) return false;
            else mapList.put(arr[i], 1);
        }
        return true;
    }
}
