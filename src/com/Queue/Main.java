package com.Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queque = new ArrayDeque<>();
        queque.add(10);
        queque.add(20);
        queque.add(30);
        reverse(queque);
        System.out.println(queque);

    }

    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty())
            stack.push(queue.remove());

        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }

}
