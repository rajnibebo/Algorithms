package com.rajni.algorithms.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DeleteSecondHalf {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        deleteSecondHalf(queue);
    }

    // Method to delete the second half of the elements and print the remaining elements
    static void deleteSecondHalf(Queue<Integer> queue) {
        // Write your code here
        deleteSecondHalf(queue, queue.size()/2);

        int count = 0;
        int size = queue.size()/2;
        while (count != size && !queue.isEmpty()) {
            int val = queue.remove();
            count++;
            queue.add(val);
        }
        count = 0;
        while (count != size && !queue.isEmpty()) {
            queue.remove();
            count++;
        }

        System.out.println(queue);

    }

    static void deleteSecondHalf(Queue<Integer> queue, int size) {
        if(!queue.isEmpty() && queue.size() != (size-1)) {
            int first = queue.remove();
            deleteSecondHalf(queue, size);
            queue.add(first);
        }

        System.out.println(queue);

    }
}
