package com.rajni.algorithms.queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue {
    private Queue<Integer> queue = new LinkedList<>();

    public void push(int x) {
        queue.add(x);

        if(queue.size() > 1) {
            int count = queue.size();
            while (count != 1) {
                int front = queue.remove();
                queue.add(front);
                count--;
            }

        }
    }

    public int pop() {
        return queue.remove();
    }

    public static void main(String[] args) {
        StackUsingOneQueue queue = new StackUsingOneQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);

        System.out.println(queue.pop());
        System.out.println(queue.pop());

        System.out.println(queue.pop());
        System.out.println(queue.pop());

    }
}
