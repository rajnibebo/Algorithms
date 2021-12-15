package com.rajni.algorithms.queue;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;

public class SortQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        sort(queue);
    }

    // Method to sort the queue
    static void sort(Queue<Integer> queue) {
        // Write your code here
        Queue<Integer> sortedQueue = new LinkedList<>();

        while (!queue.isEmpty()) {
            int min = Integer.MAX_VALUE;
            Integer newMinAdd = Integer.MIN_VALUE;

            queue.add(newMinAdd);

            // find out the minimum element from the queue.
            while (!queue.peek().equals(newMinAdd)) {
                int front = queue.remove();
                if(front < min) {
                    min = front;
                }
                queue.add(front);
            }

            queue.remove();

            // Bring the minimum element to the front of queue and remove from it.
            while (!queue.peek().equals(min)) {
                queue.add(queue.remove());
            }
            sortedQueue.add(queue.remove());
        }

        System.out.println(sortedQueue);
    }
}
