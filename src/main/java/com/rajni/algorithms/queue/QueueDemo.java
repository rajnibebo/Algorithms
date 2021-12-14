package com.rajni.algorithms.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Character> queue = new LinkedList<>();
        queue.add('a');
        queue.add('b');
        queue.add('c');
        queue.add('d');

        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.isEmpty());
    }
}
