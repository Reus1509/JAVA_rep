package org.example.seminar4.cw4.task4;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String text = "/a//b////c/d//././/..";
        System.out.println(simplePath(text));
    }

    public static String simplePath(String path) {
        Deque<String> list = new LinkedList<>();
        String[] arr = path.split("/");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("") || arr[i].equals(".")) continue;
            else if (arr[i].equals("..") ) {
                if(!list.isEmpty()) list.pollLast();
                else list.add("/");
            }
            else list.add(arr[i]);
        }
        return "/" + String.join("/", list);
    }
}
