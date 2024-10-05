package com.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queque = new ArrayDeque<>();
        queque.add(10);
        queque.add(20);
        queque.add(30);
        var front = queque.remove();
        System.out.println(front);
        System.out.println(queque);


    }
}
