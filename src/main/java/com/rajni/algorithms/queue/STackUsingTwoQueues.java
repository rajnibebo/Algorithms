package com.rajni.algorithms.queue;

import java.util.LinkedList;
import java.util.Queue;

public class STackUsingTwoQueues {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();


    void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    int pop() {
        if(q1.isEmpty()) {
            System.out.println("No elements in the stack..");
            // we actually should throw exception rather returning -1;
            return -1;
        }
        return q1.remove();
    }
}
