package com.rajni.algorithms.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintSpecificElement {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        printFifthElementFromEnd(queue);
    }

    // Method to print the fifth element from the head of the queue
    static void printFifthElementFromStart(Queue<Integer> queue) {
        // Write your code here
        int count = 0;
        while (count != 5) {
            queue.remove();
            count++;
        }
        if(queue.isEmpty()) {
            System.out.println("There are not enough elements.");
        } else {
            System.out.println(queue.element());
        }

    }

    static void printFifthElementFromEnd(Queue<Integer> queue) {
        // Write your code here
        int count = queue.size() - 5;
        int c = 0;
        while (c != count && !queue.isEmpty()) {
            queue.remove();

            c++;
        }
        if(queue.isEmpty()) {
            System.out.println("There are not enough elements.");
        } else {
            System.out.println(queue.element());
        }
    }
}
