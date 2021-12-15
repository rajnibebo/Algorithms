package com.rajni.algorithms.stacks;

import java.util.Stack;

public class KthLargestElement {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // add 20 to 1 in asc order.
       stack.push(4);
       stack.push(90);
       stack.push(22);
       stack.push(65);

        //write code to sort the Stack elements in desc order.
        System.out.println(stack);
        Stack<Integer> sortedStack = new Stack<>();

        int size = stack.size();
        while (sortedStack.size() != size) {
            int topElement = stack.pop();
            while (!sortedStack.empty()) {
                int compareTo = sortedStack.peek();
                if (topElement < compareTo) {
                    stack.push(compareTo);
                    sortedStack.pop();
                } else {
                    break;
                }

            }
            sortedStack.push(topElement);

        }
        System.out.println(sortedStack);
        findKthLargestNum(sortedStack, 2);
    }

    public static void findKthLargestNum(Stack <Integer> sortedStack, int k) {
        //write your code here
        int count = 0;
        int kthElement = -1;
        int size = sortedStack.size();
        while (count != k && k < size && k > 0) {
            kthElement = sortedStack.pop();
            count++;
        }

        if(k < size && k > 0)
            System.out.println(kthElement);
    }
}
