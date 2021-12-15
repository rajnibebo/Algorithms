package com.rajni.algorithms.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueDemo {
    public static void main1(String[] args) {
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

    public static void main(String arg[]) {
        Queue<Integer> q = new LinkedList<Integer>();

        q.add(3); // Inserts the element passed as parameter to the end of the queue
        q.add(2);
        q.add(6);
        q.add(4);
        q.add(5);
        int val = q.peek(); //returns the element at the front of queue
        for (int i = 0; i < q.size(); i++) {
            int del = q.remove(); // returns and removes the element at the front of queue
            if (val < del) {
                val = del;
            }
            q.add(del);
        }
        System.out.println(val);

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i =10; i < 20; i++) {
            queue.add(i);
        }
        int count = 0;
        while (!queue.isEmpty()){
            count++;
            if(stack.isEmpty() || stack.peek()>queue.peek()){
                int x=queue.remove();
                stack.push(x);

            }
            else
            {
                stack.pop();
            }
        }

        System.out.println(count);
    }
}
