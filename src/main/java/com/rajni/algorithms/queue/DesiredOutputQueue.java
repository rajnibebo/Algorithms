package com.rajni.algorithms.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DesiredOutputQueue {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();
        List(list);

        // Write your code here
        // You should only add some numbers, dequeue, or peek to change the elements in the queue
        // so that the queue becomes [1,4,9,14,15]
        while (!list.isEmpty()) {
            list.remove();
        }
        list.add(1);
        list.add(4);
        list.add(9);
        list.add(14);
        list.add(15);
        System.out.println(list);
    }
    public static void List(Queue<Integer> numbers) {
        int i = 0;
        while(i <= 12) {
            if(i%2==0) {
                numbers.add(i);
            }
            i++;
        }
    }
}
