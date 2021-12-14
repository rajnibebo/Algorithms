package com.rajni.algorithms.stacks;

import java.util.Stack;

public class StackSequence {
    public static void main(String[] args) {
        Stack<Integer> stackOne = new Stack<>();
        Stack<Integer> stackTwo = new Stack<>();

        stackOne.push(1);
        stackOne.push(2);
        stackOne.push(3);

        stackTwo.push(12);
        stackTwo.push(1);
        stackTwo.push(1221);
        stackTwo.push(2);
        stackTwo.push(3434);
        stackTwo.push(3);

        // check the sequence of first stack into another
        while (!stackOne.isEmpty()) {
            int element = stackOne.peek();
            while (!stackTwo.isEmpty()) {
                int secondElement = stackTwo.pop();
                if(element == secondElement) {
                    stackOne.pop();
                    //stackTwo.pop();
                    break;
                }
            }

            if(stackTwo.empty()) {
                break;
            }
        }

        System.out.println(stackOne.empty());
    }
}
