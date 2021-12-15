package com.rajni.algorithms.stacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class DeleteLastElements {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        deleteFirstHalf(stack);

    }

    // Method to delete the first half of the elements from the bottom of the stack and print the remaining elements
    static void deleteFirstHalf(Stack<Integer> stack) {
        // Write your code here
        Stack<Integer> newStack = new Stack<>();
        int count = stack.size()/2;
        if(stack.size() % 2 != 0) {
            count++;
        }
        while (count > 0) {
            newStack.add(stack.pop());
            count--;
        }

        while (!stack.isEmpty()) {
            stack.pop();
        }

        while (!newStack.isEmpty()) {
            stack.push(newStack.pop());
        }

        System.out.println(stack);
    }
}
